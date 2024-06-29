import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class292 extends class328 {
   @OriginalMember(
      owner = "client!gf",
      name = "l",
      descriptor = "I"
   )
   private int field4039;
   @OriginalMember(
      owner = "client!gf",
      name = "x",
      descriptor = "I"
   )
   private int field4031;
   @OriginalMember(
      owner = "client!gf",
      name = "s",
      descriptor = "I"
   )
   private int field4032;
   @OriginalMember(
      owner = "client!gf",
      name = "q",
      descriptor = "I"
   )
   private int field4040;
   @OriginalMember(
      owner = "client!gf",
      name = "n",
      descriptor = "Lsc;"
   )
   private class369 field4035;
   @OriginalMember(
      owner = "client!gf",
      name = "k",
      descriptor = "I"
   )
   private int field4027;
   @OriginalMember(
      owner = "client!gf",
      name = "p",
      descriptor = "I"
   )
   private int field4037;
   @OriginalMember(
      owner = "client!gf",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4043 = new String[]{method2198(method2197("no\u001a\"A")), method2198(method2197("no\u001a!A")), method2198(method2197("r'\u001aM\u0014")), method2198(method2197("no\u001a_\u0000g`@]A")), method2198(method2197("g|X\u000f")), method2198(method2197("no\u001a&A")), method2198(method2197("no\u001a'A")), method2198(method2197("no\u001a A"))};
   @OriginalMember(
      owner = "client!gf",
      name = "w",
      descriptor = "I"
   )
   public static int field4038 = 1408;
   @OriginalMember(
      owner = "client!gf",
      name = "u",
      descriptor = "Leg;"
   )
   public static class118 field4028 = new class118(118, 4);
   @OriginalMember(
      owner = "client!gf",
      name = "z",
      descriptor = "I"
   )
   public static int field4042 = 0;
   @OriginalMember(
      owner = "client!gf",
      name = "m",
      descriptor = "Lek;"
   )
   public static class536 field4041 = new class536(11, 8);
   @OriginalMember(
      owner = "client!gf",
      name = "o",
      descriptor = "I"
   )
   public static int field4030;
   @OriginalMember(
      owner = "client!gf",
      name = "v",
      descriptor = "I"
   )
   public static int field4033;
   @OriginalMember(
      owner = "client!gf",
      name = "r",
      descriptor = "I"
   )
   public static int field4034;
   @OriginalMember(
      owner = "client!gf",
      name = "t",
      descriptor = "I"
   )
   public static int field4036;
   @OriginalMember(
      owner = "client!gf",
      name = "y",
      descriptor = "Lofa;"
   )
   private class349 field4029;

   @OriginalMember(
      owner = "client!gf",
      name = "b",
      descriptor = "(I)Lhba;",
      line = 7
   )
   public static final class10 method2192(int arg0) {
      try {
         if (arg0 != -9730) {
            method2192(59);
         }

         ++field4036;
         return class426.method3155(true, class622.field9156) ? class430.field6143 : class430.field6150;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4043[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "b",
      descriptor = "(B)V",
      line = 23
   )
   public static void method2193(byte arg0) {
      try {
         field4028 = null;
         if (arg0 != 35) {
            field4038 = -99;
         }

         field4041 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4043[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "a",
      descriptor = "(IBZI)I",
      line = 41
   )
   public static final int method2194(int arg0, byte arg1, boolean arg2, int arg3) {
      try {
         ++field4034;
         if (arg1 < 45) {
            return 19;
         } else {
            class111 var4 = class616.method4475(arg3, arg2, (byte)-119);
            if (var4 == null) {
               return -1;
            } else {
               return arg0 >= 0 && arg0 < var4.field1391.length ? var4.field1391[arg0] : -1;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4043[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "a",
      descriptor = "(B)Lofa;",
      line = 62
   )
   public final class349 method2195(byte arg0) {
      boolean var2 = client.field4360;

      try {
         if (arg0 <= 86) {
            this.field4031 = 70;
         }

         ++field4030;
         if (this.field4029 == null) {
            class162 var3;
            byte var4;
            int var5;
            int var9;
            label88: {
               class491.field7033[3] = this.field4037;
               class491.field7033[4] = this.field4032;
               class491.field7033[2] = this.field4039;
               class491.field7033[0] = this.field4027;
               class491.field7033[5] = this.field4040;
               var3 = this.field4035.field802;
               class491.field7033[1] = this.field4031;
               var4 = 0;
               var5 = 0;
               int var6 = 0;
               if (var2) {
                  if (!var3.method1353(class491.field7033[var6], (byte)123)) {
                     return null;
                  }
               } else if (~var6 <= -7) {
                  var9 = 0;
                  if (!var2) {
                     break label88;
                  }
               } else if (!var3.method1353(class491.field7033[var6], (byte)123)) {
                  return null;
               }

               while(true) {
                  class317 var7 = var3.method1354(class491.field7033[var6], (byte)-109);
                  int var8 = var7.field4318 ? 64 : 128;
                  if (~var8 < ~var5) {
                     var5 = var8;
                  }

                  if (~var7.field4322 < -1) {
                     var4 = 1;
                  }

                  ++var6;
                  if (~var6 <= -7) {
                     var9 = 0;
                     if (!var2) {
                        break;
                     }
                  } else if (!var3.method1353(class491.field7033[var6], (byte)123)) {
                     return null;
                  }
               }
            }

            if (var2) {
               class404.field5835[var9] = var3.method1350(1.0F, class491.field7033[var9], var5, var5, (byte)86, false);
               ++var9;
            }

            while(true) {
               while(var9 < 6) {
                  class404.field5835[var9] = var3.method1350(1.0F, class491.field7033[var9], var5, var5, (byte)86, false);
                  ++var9;
               }

               if (!var2) {
                  this.field4029 = this.field4035.method2609(class404.field5835, false, var5, ~var4 != -1);
                  break;
               }

               ++var9;
            }
         }

         return this.field4029;
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field4043[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "c",
      descriptor = "(B)[Lup;",
      line = 125
   )
   public static final class291[] method2196(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gf",
      name = "<init>",
      descriptor = "(Lsc;IIIIII)V",
      line = 216
   )
   public class292(class369 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         this.field4039 = arg3;
         this.field4031 = arg2;
         this.field4032 = arg5;
         this.field4040 = arg6;
         this.field4035 = arg0;
         this.field4027 = arg1;
         this.field4037 = arg4;
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field4043[3] + (arg0 != null ? field4043[2] : field4043[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2197(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2198(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
