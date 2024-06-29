import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class187 extends class799 {
   @OriginalMember(
      owner = "client!dba",
      name = "J",
      descriptor = "I"
   )
   private int field2927 = -1;
   @OriginalMember(
      owner = "client!dba",
      name = "C",
      descriptor = "I"
   )
   private int field2934 = -1;
   @OriginalMember(
      owner = "client!dba",
      name = "E",
      descriptor = "I"
   )
   public int field2932;
   @OriginalMember(
      owner = "client!dba",
      name = "L",
      descriptor = "I"
   )
   public int field2923;
   @OriginalMember(
      owner = "client!dba",
      name = "y",
      descriptor = "I"
   )
   public int field2920;
   @OriginalMember(
      owner = "client!dba",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2935 = new String[]{method1685(method1684("\u001cemi\u0001P")), method1685(method1684("\u001cemi\u0007P")), method1685(method1684("\u001cemi\u0004P")), method1685(method1684("\u0003)\"i?")), method1685(method1684("\u0016r`+")), method1685(method1684("\u001cemi\u0000P")), method1685(method1684("\u001cemi~\u0011ie3|P")), method1685(method1684("\u001cemi\u0006P")), method1685(method1684("\u001cemi\u0003P")), method1685(method1684("\u001cemi\u0005P"))};
   @OriginalMember(
      owner = "client!dba",
      name = "G",
      descriptor = "Llj;"
   )
   public static class304 field2921 = new class304(64);
   @OriginalMember(
      owner = "client!dba",
      name = "x",
      descriptor = "Lhka;"
   )
   public static class377 field2933 = new class377(4, 19);
   @OriginalMember(
      owner = "client!dba",
      name = "B",
      descriptor = "F"
   )
   public static float field2929;
   @OriginalMember(
      owner = "client!dba",
      name = "z",
      descriptor = "I"
   )
   public static int field2922;
   @OriginalMember(
      owner = "client!dba",
      name = "H",
      descriptor = "I"
   )
   public static int field2924;
   @OriginalMember(
      owner = "client!dba",
      name = "A",
      descriptor = "I"
   )
   public static int field2926;
   @OriginalMember(
      owner = "client!dba",
      name = "D",
      descriptor = "I"
   )
   public static int field2928;
   @OriginalMember(
      owner = "client!dba",
      name = "w",
      descriptor = "I"
   )
   public static int field2930;
   @OriginalMember(
      owner = "client!dba",
      name = "K",
      descriptor = "I"
   )
   public static int field2931;
   @OriginalMember(
      owner = "client!dba",
      name = "I",
      descriptor = "Lkf;"
   )
   public static class401 field2925;

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(IIIIIIBI)V"
   )
   public final void method1677(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
      try {
         ++field2930;
         super.field11637.method4792(-26367, this);
         OpenGL.glCopyTexSubImage3D(super.field11642, 0, arg5, arg4, arg2, arg3, arg1, arg7, arg0);
         OpenGL.glFlush();
         if (arg6 != -81) {
            field2933 = null;
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field2935[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(ILwo;II)V"
   )
   public static final void method1678(int arg0, class9 arg1, int arg2, int arg3) {
      try {
         if (arg3 < 110) {
            field2933 = null;
         }

         ++field2924;
         int[] var4 = new int[4];
         class107.method1025(var4, 0, var4.length, arg2);
         class113.method1059(2, arg1, arg0, false, var4);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field2935[2] + arg0 + ',' + (arg1 != null ? field2935[3] : field2935[4]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "<init>",
      descriptor = "(Lc;IIII)V"
   )
   public class187(class652 arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);

      try {
         this.field2932 = arg4;
         this.field2923 = arg2;
         this.field2920 = arg3;
         super.field11637.method4792(-26367, this);
         OpenGL.glTexImage3Dub(super.field11642, 0, super.field11630, this.field2923, this.field2920, this.field2932, 0, class605.method4467(super.field11630, (byte)122), 5121, (byte[])null, 0);
         this.method5760(true, (byte)-107);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2935[6] + (arg0 != null ? field2935[3] : field2935[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1679(int arg0, int arg1, int arg2) {
      try {
         ++field2922;
         return arg2 <= 126 ? true : ~(arg1 & 24) != -1 | (arg1 & 544) == 544;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2935[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(ZLjava/lang/String;Z)V"
   )
   public static final void method1680(boolean arg0, String arg1, boolean arg2) {
      boolean var3 = client.field1786;

      try {
         ++field2931;
         String var16 = arg1.toLowerCase();
         short[] var4 = new short[16];
         int var5 = 0;
         int var6 = !arg0 ? 0 : 32768;
         int var7 = (arg0 ? class557.field8302.field8136 : class557.field8302.field8141) + var6;
         int var8 = var6;
         String[] var12;
         int var13;
         if (!var3 && ~var7 >= ~var6) {
            if (arg2) {
               class356.field5478 = var4;
               class293.field4640 = var5;
               class801.field11645 = 0;
               var12 = new String[class293.field4640];
               var13 = 0;
               if (var3) {
                  var12[var13] = class557.field8302.method4129(var4[var13], true).method3004((byte)72);
                  ++var13;
               }

               while(true) {
                  while(var13 < class293.field4640) {
                     var12[var13] = class557.field8302.method4129(var4[var13], true).method3004((byte)72);
                     ++var13;
                  }

                  if (!var3) {
                     class14.method103(class356.field5478, var12, !arg2);
                     return;
                  }

                  ++var13;
               }
            }
         } else {
            do {
               class367 var9 = class557.field8302.method4129(var8, true);
               if (!var9.field5713) {
                  ++var8;
               } else if (~var9.method3004((byte)71).toLowerCase().indexOf(var16) == 0) {
                  ++var8;
               } else {
                  if (var5 >= 50) {
                     class293.field4640 = -1;
                     class356.field5478 = null;
                     return;
                  }

                  if (var5 < var4.length) {
                     var4[var5++] = (short)var8;
                     ++var8;
                  } else {
                     short[] var10 = new short[var4.length * 2];
                     int var11 = 0;
                     if (var3) {
                        var10[var11] = var4[var11];
                        ++var11;
                     }

                     while(true) {
                        while(~var11 > ~var5) {
                           var10[var11] = var4[var11];
                           ++var11;
                        }

                        if (!var3) {
                           var4 = var10;
                           var10[var5++] = (short)var8;
                           ++var8;
                           break;
                        }

                        var10[var11] = var4[var11];
                        ++var11;
                     }
                  }
               }
            } while(~var7 < ~var8);

            if (arg2) {
               class356.field5478 = var4;
               class293.field4640 = var5;
               class801.field11645 = 0;
               var12 = new String[class293.field4640];
               var13 = 0;
               if (var3) {
                  var12[var13] = class557.field8302.method4129(var4[var13], true).method3004((byte)72);
                  ++var13;
               }

               while(true) {
                  while(var13 < class293.field4640) {
                     var12[var13] = class557.field8302.method4129(var4[var13], true).method3004((byte)72);
                     ++var13;
                  }

                  if (!var3) {
                     class14.method103(class356.field5478, var12, !arg2);
                     return;
                  }

                  ++var13;
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field2935[9] + arg0 + ',' + (arg1 != null ? field2935[3] : field2935[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method1681(byte arg0) {
      try {
         field2921 = null;
         if (arg0 <= -1) {
            field2925 = null;
            field2933 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2935[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "<init>",
      descriptor = "(Lc;IIII[BI)V"
   )
   public class187(class652 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
      super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);

      try {
         this.field2920 = arg3;
         this.field2932 = arg4;
         this.field2923 = arg2;
         super.field11637.method4792(-26367, this);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage3Dub(super.field11642, 0, super.field11630, this.field2923, this.field2920, this.field2932, 0, arg6, 5121, arg5, 0);
         OpenGL.glPixelStorei(3317, 4);
         this.method5760(true, (byte)-107);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field2935[6] + (arg0 != null ? field2935[3] : field2935[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field2935[3] : field2935[4]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "d",
      descriptor = "(B)I"
   )
   public static final int method1682(byte arg0) {
      try {
         ++field2928;
         if (arg0 != -30) {
            method1681((byte)26);
         }

         if (class751.field11144 != null) {
            return 3;
         } else {
            return class417.field6455 ? 2 : 1;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2935[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1683(byte arg0) {
      try {
         if (arg0 != -117) {
            method1679(-14, -49, -21);
         }

         OpenGL.glFramebufferTexture3DEXT(this.field2934, this.field2927, super.field11642, 0, 0, 0);
         ++field2926;
         this.field2934 = -1;
         this.field2927 = -1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2935[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1684(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1685(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
