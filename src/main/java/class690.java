import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jka")
public class class690 {
   @OriginalMember(
      owner = "client!jka",
      name = "c",
      descriptor = "I"
   )
   public int field10153 = -1;
   @OriginalMember(
      owner = "client!jka",
      name = "k",
      descriptor = "I"
   )
   public int field10161 = -1;
   @OriginalMember(
      owner = "client!jka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10165 = new String[]{method5040(method5039("\u0015q\u0000B~W")), method5040(method5039("\u0015q\u0000B}W")), method5040(method5039("\u00044OBE")), method5040(method5039("\u0011o\r\u0000")), method5040(method5039("\u0015q\u0000BzW")), method5040(method5039("\u0015q\u0000B{W")), method5040(method5039("\u0015q\u0000ByW")), method5040(method5039("\u0015q\u0000B|W"))};
   @OriginalMember(
      owner = "client!jka",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field10162 = new int[5];
   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "Lek;"
   )
   public static class536 field10158 = new class536(7, 6);
   @OriginalMember(
      owner = "client!jka",
      name = "e",
      descriptor = "[Lio;"
   )
   public static class464[] field10163 = new class464[4];
   @OriginalMember(
      owner = "client!jka",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10164 = null;
   @OriginalMember(
      owner = "client!jka",
      name = "f",
      descriptor = "I"
   )
   public static int field10154;
   @OriginalMember(
      owner = "client!jka",
      name = "l",
      descriptor = "I"
   )
   public static int field10155;
   @OriginalMember(
      owner = "client!jka",
      name = "b",
      descriptor = "I"
   )
   public static int field10156;
   @OriginalMember(
      owner = "client!jka",
      name = "i",
      descriptor = "I"
   )
   public static int field10159;
   @OriginalMember(
      owner = "client!jka",
      name = "j",
      descriptor = "I"
   )
   public static int field10160;
   @OriginalMember(
      owner = "client!jka",
      name = "g",
      descriptor = "[I"
   )
   public int[] field10157;

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(ILiha;)V"
   )
   public static final void method5033(int arg0, class32 arg1) {
      boolean var2 = client.field4360;

      try {
         ++field10156;
         if (arg0 != 17778) {
            method5034((class32)null, (byte)-117);
         }

         if (arg1 != null) {
            class627.field9216.method2930((byte)-88, arg1);
            ++class278.field3784;
            Object var3 = null;
            class598 var4;
            if (!arg1.field468 && !"".equals(arg1.field471)) {
               class598 var10000;
               long var5;
               label75: {
                  var5 = arg1.field465;
                  var4 = (class598)class53.field677.method329((byte)121, var5);
                  if (var2) {
                     var10000 = var4;
                  } else if (var4 == null) {
                     var10000 = var4;
                     if (!var2) {
                        break label75;
                     }
                  } else {
                     var10000 = var4;
                  }

                  label74:
                  while(true) {
                     while(var10000.field8793.equals(arg1.field471)) {
                        var10000 = var4;
                        if (!var2) {
                           break label74;
                        }
                     }

                     var4 = (class598)class53.field677.method333(false);
                     if (var4 == null) {
                        var10000 = var4;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var10000 = var4;
                     }
                  }
               }

               if (var10000 == null) {
                  var4 = (class598)class773.field11360.method725(0, var5);
                  if (var4 != null && !var4.field8793.equals(arg1.field471)) {
                     var4 = null;
                  }

                  if (var4 == null) {
                     var4 = new class598(arg1.field471);
                  }

                  class53.field677.method336(-1, var5, var4);
                  ++class578.field8529;
               }
            } else {
               var4 = new class598(arg1.field471);
               ++class578.field8529;
            }

            if (var4.method4345(arg1, (byte)-127)) {
               class112.method914(var4, -55);
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field10165[4] + arg0 + ',' + (arg1 != null ? field10165[2] : field10165[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(Liha;B)V"
   )
   public static final void method5034(class32 param0, byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(ILwf;)V"
   )
   public final void method5035(int arg0, class147 arg1) {
      boolean var3 = client.field4360;

      try {
         if (arg0 != 5521) {
            field10162 = null;
         }

         ++field10154;

         do {
            int var4 = arg1.method1143(-15465);
            if (var4 == 0) {
               break;
            }

            this.method5038(arg1, (byte)26, var4);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10165[6] + arg0 + ',' + (arg1 != null ? field10165[2] : field10165[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5036(byte arg0) {
      try {
         field10164 = null;
         field10163 = null;
         field10158 = null;
         field10162 = null;
         if (arg0 != -30) {
            field10158 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10165[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(BD)V"
   )
   public static final void method5037(byte arg0, double arg1) {
      boolean var3 = client.field4360;

      try {
         if (class112.field1410 != arg1) {
            int var4 = 0;
            int var5;
            if (var3) {
               var5 = (int)(255.0D * Math.pow((double)var4 / 255.0D, arg1));
               class631.field9251[var4] = ~var5 >= -256 ? var5 : 255;
               ++var4;
            }

            while(true) {
               double var10000;
               if (~var4 <= -257) {
                  var10000 = arg1;
                  if (!var3) {
                     class112.field1410 = arg1;
                     break;
                  }
               } else {
                  var10000 = 255.0D * Math.pow((double)var4 / 255.0D, arg1);
               }

               var5 = (int)var10000;
               class631.field9251[var4] = ~var5 >= -256 ? var5 : 255;
               ++var4;
            }
         }

         ++field10160;
         if (arg0 != 64) {
            method5033(83, (class32)null);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field10165[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "a",
      descriptor = "(Lwf;BI)V"
   )
   private final void method5038(class147 arg0, byte arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         if (arg1 == 26) {
            ++field10155;
            if (arg2 == 1) {
               this.field10161 = arg0.method1211(-26166);
            } else if (~arg2 != -3) {
               if (~arg2 == -4) {
                  this.field10153 = arg0.method1143(arg1 ^ -15475);
               }
            } else {
               this.field10157 = new int[arg0.method1143(arg1 ^ -15475)];
               int var5 = 0;
               if (var4) {
                  this.field10157[var5] = arg0.method1211(-26166);
                  ++var5;
               }

               while(true) {
                  while(~var5 > ~this.field10157.length) {
                     this.field10157[var5] = arg0.method1211(-26166);
                     ++var5;
                  }

                  if (!var4) {
                     return;
                  }

                  ++var5;
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field10165[1] + (arg0 != null ? field10165[2] : field10165[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5039(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5040(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
