import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class789 extends class549 {
   @OriginalMember(
      owner = "client!ph",
      name = "y",
      descriptor = "I"
   )
   private int field11502;
   @OriginalMember(
      owner = "client!ph",
      name = "w",
      descriptor = "I"
   )
   private int field11505;
   @OriginalMember(
      owner = "client!ph",
      name = "H",
      descriptor = "I"
   )
   public int field11498;
   @OriginalMember(
      owner = "client!ph",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11510 = new String[]{method5685(method5684("9n2U")), method5685(method5684("'sp\u0005t9r*\u00075")), method5685(method5684(",5p\u0017`")), method5685(method5684("'sp|5")), method5685(method5684("'sp~5")), method5685(method5684("'sp}5")), method5685(method5684("'spx5")), method5685(method5684("'spz5")), method5685(method5684("'sp{5")), method5685(method5684("'sp\u007f5"))};
   @OriginalMember(
      owner = "client!ph",
      name = "A",
      descriptor = "Z"
   )
   public static boolean field11501 = false;
   @OriginalMember(
      owner = "client!ph",
      name = "z",
      descriptor = "[I"
   )
   public static int[] field11504 = new int[3];
   @OriginalMember(
      owner = "client!ph",
      name = "B",
      descriptor = "Lse;"
   )
   public static class6 field11509 = new class6(21, 3);
   @OriginalMember(
      owner = "client!ph",
      name = "G",
      descriptor = "I"
   )
   public static int field11499;
   @OriginalMember(
      owner = "client!ph",
      name = "F",
      descriptor = "I"
   )
   public static int field11500;
   @OriginalMember(
      owner = "client!ph",
      name = "C",
      descriptor = "I"
   )
   public static int field11503;
   @OriginalMember(
      owner = "client!ph",
      name = "x",
      descriptor = "I"
   )
   public static int field11506;
   @OriginalMember(
      owner = "client!ph",
      name = "D",
      descriptor = "I"
   )
   public static int field11507;
   @OriginalMember(
      owner = "client!ph",
      name = "E",
      descriptor = "I"
   )
   public static int field11508;

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5678(boolean arg0) {
      try {
         if (!arg0) {
            method5683(119);
         }

         field11504 = null;
         field11509 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11510[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "<init>",
      descriptor = "(Liu;IIZ[[I)V"
   )
   public class789(class530 param1, int param2, int param3, boolean param4, int[][] param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(IIIZ)V"
   )
   public static final void method5679(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         if (arg0 != -4043) {
            field11504 = null;
         }

         ++field11508;
         if (arg2 >= 8000 && arg2 <= 48000) {
            class36.field514 = arg2;
            class10.field226 = arg1;
            class243.field3061 = arg3;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field11510[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method970(byte arg0) {
      try {
         if (arg0 < -12) {
            OpenGL.glFramebufferTexture2DEXT(this.field11505, this.field11502, 3553, 0, 0);
            ++field11506;
            this.field11502 = -1;
            this.field11505 = -1;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11510[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(IIIILha;IZIIIILwf;)V"
   )
   public static final void method5680(int arg0, int arg1, int arg2, int arg3, class479 arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, class541 arg11) {
      try {
         if (arg0 < arg10 && arg0 - -arg5 > arg10 && ~(arg2 + -13) > ~arg1 && ~(arg2 + 3) < ~arg1 && arg11.field7904) {
            arg7 = arg8;
         }

         ++field11507;
         int[] var12 = null;
         if (arg6) {
            if (!class505.method3816(-120, arg11.field7909)) {
               if (~arg11.field7913 != 0) {
                  var12 = class166.field2126.method5576(arg11.field7913, (byte)-85).field7999;
               } else if (!class141.method1161(arg11.field7909, false)) {
                  if (class258.method2080(arg11.field7909, 25161)) {
                     Object var13 = null;
                     class294 var14;
                     if (~arg11.field7909 != -1011) {
                        var14 = class438.field5967.method929((byte)-128, (int)(arg11.field7912 >>> 32 & 2147483647L));
                     } else {
                        var14 = class438.field5967.method929((byte)-117, (int)arg11.field7912);
                     }

                     if (var14.field4036 != null) {
                        var14 = var14.method2362(class175.field2266, true);
                     }

                     if (var14 != null) {
                        var12 = var14.field4103;
                     }
                  }
               } else {
                  class411 var15 = (class411)class35.field493.method1818(-1, (long)((int)arg11.field7912));
                  if (var15 != null) {
                     class81 var16 = var15.field5654;
                     class473 var17 = var16.field1135;
                     if (var17.field6583 != null) {
                        var17 = var17.method3603(class175.field2266, 4764);
                     }

                     if (var17 != null) {
                        var12 = var17.field6564;
                     }
                  }
               }
            } else {
               var12 = class166.field2126.method5576((int)arg11.field7912, (byte)-91).field7999;
            }

            String var18 = class406.method3183(-18170, arg11);
            if (var12 != null) {
               var18 = var18 + class432.method3345(var12, true);
            }

            class98.field1306.method3434(class476.field6643, 0, arg0 + 3, 118, arg2, arg7, class175.field2255, var18);
            if (arg11.field7906) {
               class258.field3259.method4760(arg0 + 5 + class492.field6871.method139(46, var18), arg2 + -12);
            }
         }
      } catch (RuntimeException var20) {
         throw class93.method866(var20, field11510[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field11510[2] : field11510[0]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + (arg11 != null ? field11510[2] : field11510[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(IIBII)V"
   )
   public final void method5681(int arg0, int arg1, byte arg2, int arg3, int arg4) {
      try {
         ++field11499;
         OpenGL.glFramebufferTexture2DEXT(arg3, arg1, arg4, super.field8098, arg0);
         this.field11502 = arg1;
         if (arg2 >= 59) {
            this.field11505 = arg3;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field11510[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(BI)I"
   )
   public static final int method5682(byte arg0, int arg1) {
      try {
         int var4 = ((-1431655766 & arg1) >>> 1) + (1431655765 & arg1);
         ++field11500;
         int var5 = (var4 >>> 2 & -214748365) + (858993459 & var4);
         int var6 = var5 - -(var5 >>> 4) & 252645135;
         int var7 = (var6 >>> 8) + var6;
         int var8 = (var7 >>> 16) + var7;
         if (arg0 >= -22) {
            method5678(true);
         }

         return var8 & 255;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11510[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "<init>",
      descriptor = "(Liu;IIZ[[BI)V"
   )
   public class789(class530 param1, int param2, int param3, boolean param4, byte[][] param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ph",
      name = "f",
      descriptor = "(I)V"
   )
   public static final void method5683(int arg0) {
      try {
         ++field11503;
         if (arg0 >= 55) {
            class625.field9234.method3201((byte)106);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11510[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "<init>",
      descriptor = "(Liu;II)V"
   )
   public class789(class530 param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ph",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5684(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ph",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5685(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
