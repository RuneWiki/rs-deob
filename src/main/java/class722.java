import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class722 {
   @OriginalMember(
      owner = "client!om",
      name = "j",
      descriptor = "Lfn;"
   )
   public class96 field10341 = new class96();
   @OriginalMember(
      owner = "client!om",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10344 = new String[]{method5233(method5232("EcH\fH")), method5233(method5232("EcH\rH")), method5233(method5232("EcH\bH")), method5233(method5232("Q Hd\u001d")), method5233(method5232("D{\n&")), method5233(method5232("EcH\u000bH")), method5233(method5232("EcH\u000eH")), method5233(method5232("EcH\tH")), method5233(method5232("EcH\u0002H")), method5233(method5232("EcH\u0003H")), method5233(method5232("EcH\u0000H")), method5233(method5232("EcHv\tDg\u0012tH"))};
   @OriginalMember(
      owner = "client!om",
      name = "g",
      descriptor = "Lhha;"
   )
   public static class724 field10337 = new class724(88, 5);
   @OriginalMember(
      owner = "client!om",
      name = "i",
      descriptor = "I"
   )
   public static int field10333;
   @OriginalMember(
      owner = "client!om",
      name = "k",
      descriptor = "I"
   )
   public static int field10334;
   @OriginalMember(
      owner = "client!om",
      name = "d",
      descriptor = "I"
   )
   public static int field10335;
   @OriginalMember(
      owner = "client!om",
      name = "b",
      descriptor = "I"
   )
   public static int field10336;
   @OriginalMember(
      owner = "client!om",
      name = "e",
      descriptor = "I"
   )
   public static int field10338;
   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "I"
   )
   public static int field10339;
   @OriginalMember(
      owner = "client!om",
      name = "c",
      descriptor = "I"
   )
   public static int field10340;
   @OriginalMember(
      owner = "client!om",
      name = "f",
      descriptor = "I"
   )
   public static int field10342;
   @OriginalMember(
      owner = "client!om",
      name = "h",
      descriptor = "Lfn;"
   )
   private class96 field10343;

   @OriginalMember(
      owner = "client!om",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method5222(byte arg0) {
      boolean var2 = client.field10022;

      try {
         ++field10342;

         while(true) {
            class96 var3 = this.field10341.field1553;
            if (this.field10341 != var3) {
               var3.method962(false);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            if (arg0 != -63) {
               method5226((String)null, -90, (String)null, 9, 112, 108, (String)null, (String)null, (String)null);
            }

            this.field10343 = null;
            break;
         }

      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field10344[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method5223(boolean arg0) {
      boolean var2 = client.field10022;

      try {
         ++field10338;
         int var3 = 0;
         class96 var4 = this.field10341.field1553;
         if (arg0) {
            method5230(93, 100, 1);
            if (var2) {
               ++var3;
               var4 = var4.field1553;
            }
         }

         while(true) {
            if (this.field10341 == var4) {
               if (!var2) {
                  return var3;
               }
            } else {
               ++var3;
            }

            var4 = var4.field1553;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10344[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(Lfn;I)V"
   )
   public final void method5224(class96 arg0, int arg1) {
      try {
         ++field10339;
         if (arg0.field1547 != null) {
            arg0.method962(false);
         }

         arg0.field1547 = this.field10341.field1547;
         arg0.field1553 = this.field10341;
         if (arg1 <= 45) {
            method5228(-115);
         }

         arg0.field1547.field1553 = arg0;
         arg0.field1553.field1547 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10344[5] + (arg0 != null ? field10344[3] : field10344[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "b",
      descriptor = "(Z)Lfn;"
   )
   public final class96 method5225(boolean arg0) {
      try {
         ++field10333;
         class96 var2 = this.field10341.field1553;
         if (this.field10341 == var2) {
            this.field10343 = null;
            return null;
         } else {
            if (!arg0) {
               this.method5223(false);
            }

            this.field10343 = var2.field1553;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10344[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
   )
   public static final void method5226(String arg0, int arg1, String arg2, int arg3, int arg4, int arg5, String arg6, String arg7, String arg8) {
      boolean var9 = client.field10022;

      try {
         ++field10340;
         class701 var10 = class560.field7966[99];
         int var11 = 99;
         if (var9) {
            class560.field7966[var11] = class560.field7966[var11 + -1];
            --var11;
         }

         while(true) {
            while(var11 > 0) {
               class560.field7966[var11] = class560.field7966[var11 + -1];
               --var11;
            }

            if (!var9) {
               label53: {
                  if (var10 == null) {
                     var10 = new class701(arg1, arg3, arg7, arg6, arg2, arg0, arg5, arg8);
                     if (!var9) {
                        break label53;
                     }
                  }

                  var10.method5120(arg1, arg8, arg7, arg3, arg6, arg5, arg2, arg0, (byte)11);
               }

               if (arg4 != 24778) {
                  method5228(-31);
               }

               class602.field8583 = class742.field10569;
               ++class239.field3687;
               class560.field7966[0] = var10;
               return;
            }

            --var11;
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field10344[9] + (arg0 != null ? field10344[3] : field10344[4]) + ',' + arg1 + ',' + (arg2 != null ? field10344[3] : field10344[4]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field10344[3] : field10344[4]) + ',' + (arg7 != null ? field10344[3] : field10344[4]) + ',' + (arg8 != null ? field10344[3] : field10344[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "b",
      descriptor = "(I)Lfn;"
   )
   public final class96 method5227(int arg0) {
      try {
         ++field10335;
         if (arg0 != -17856) {
            this.method5222((byte)73);
         }

         class96 var2 = this.field10343;
         if (this.field10341 == var2) {
            this.field10343 = null;
            return null;
         } else {
            this.field10343 = var2.field1553;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10344[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5228(int arg0) {
      try {
         field10337 = null;
         if (arg0 != 0) {
            field10337 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10344[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(B)Lfn;"
   )
   public final class96 method5229(byte arg0) {
      try {
         ++field10336;
         class96 var2 = this.field10341.field1553;
         if (this.field10341 == var2) {
            return null;
         } else {
            var2.method962(false);
            if (arg0 != -126) {
               this.method5225(true);
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10344[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method5230(int arg0, int arg1, int arg2) {
      try {
         ++field10334;
         int var3 = -93 % ((arg2 - -15) / 62);
         return (2048 & arg0) != 0;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field10344[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "()V"
   )
   public static final void method5231() {
      for(int var0 = 0; var0 < class155.field2377; ++var0) {
         class578 var1 = class788.field11486[var0];
         class748.method5385(var1, true);
         class788.field11486[var0] = null;
      }

      class155.field2377 = 0;
   }

   @OriginalMember(
      owner = "client!om",
      name = "<init>",
      descriptor = "()V"
   )
   public class722() {
      try {
         this.field10341.field1553 = this.field10341;
         this.field10341.field1547 = this.field10341;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10344[11] + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5232(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!om",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5233(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 14;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
