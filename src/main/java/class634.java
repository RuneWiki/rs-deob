import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class634 {
   @OriginalMember(
      owner = "client!cf",
      name = "d",
      descriptor = "[Ldn;"
   )
   private class546[] field8966;
   @OriginalMember(
      owner = "client!cf",
      name = "g",
      descriptor = "I"
   )
   private int field8968;
   @OriginalMember(
      owner = "client!cf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8970 = new String[]{method4605(method4604("o{S6\u001d")), method4605(method4604("o{SK\\bt\tI\u001d")), method4605(method4604("o{S3\u001d")), method4605(method4604("o{S5\u001d")), method4605(method4604("w3SYH")), method4605(method4604("bh\u0011\u001b")), method4605(method4604("o{S4\u001d"))};
   @OriginalMember(
      owner = "client!cf",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field8967 = new int[]{1, 2, 4, 8};
   @OriginalMember(
      owner = "client!cf",
      name = "c",
      descriptor = "I"
   )
   public static int field8961;
   @OriginalMember(
      owner = "client!cf",
      name = "h",
      descriptor = "I"
   )
   public static int field8963;
   @OriginalMember(
      owner = "client!cf",
      name = "i",
      descriptor = "I"
   )
   public static int field8964;
   @OriginalMember(
      owner = "client!cf",
      name = "f",
      descriptor = "I"
   )
   public static int field8965;
   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "J"
   )
   private long field8962;
   @OriginalMember(
      owner = "client!cf",
      name = "e",
      descriptor = "Ldn;"
   )
   private class546 field8969;

   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "(JBLdn;)V"
   )
   public final void method4600(long arg0, byte arg1, class546 arg2) {
      try {
         int var5 = -106 % ((arg1 - 58) / 34);
         ++field8965;
         if (arg2.field7451 != null) {
            arg2.method3943(-4);
         }

         class546 var6 = this.field8966[(int)(arg0 & (long)(this.field8968 - 1))];
         arg2.field7451 = var6.field7451;
         arg2.field7453 = var6;
         arg2.field7451.field7453 = arg2;
         arg2.field7452 = arg0;
         arg2.field7453.field7451 = arg2;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field8970[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8970[4] : field8970[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "(I)Ldn;"
   )
   public final class546 method4601(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field8963;
         if (this.field8969 == null) {
            return null;
         } else {
            class546 var3 = this.field8966[(int)((long)(this.field8968 + -1) & this.field8962)];
            class546 var4;
            if (var2) {
               if (~this.field8962 == ~this.field8969.field7452) {
                  var4 = this.field8969;
                  this.field8969 = this.field8969.field7453;
                  return var4;
               }

               this.field8969 = this.field8969.field7453;
            }

            while(true) {
               int var10000;
               if (this.field8969 == var3) {
                  var10000 = arg0;
                  if (!var2) {
                     if (arg0 >= -52) {
                        this.field8969 = null;
                     }

                     this.field8969 = null;
                     return null;
                  }
               } else {
                  long var7;
                  var10000 = (var7 = ~this.field8962 - ~this.field8969.field7452) == 0L ? 0 : (var7 < 0L ? -1 : 1);
               }

               if (var10000 == 0) {
                  var4 = this.field8969;
                  this.field8969 = this.field8969.field7453;
                  return var4;
               }

               this.field8969 = this.field8969.field7453;
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8970[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4602(byte arg0) {
      try {
         field8967 = null;
         int var1 = -111 / ((arg0 - 26) / 60);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8970[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cf",
      name = "a",
      descriptor = "(IJ)Ldn;"
   )
   public final class546 method4603(int arg0, long arg1) {
      boolean var4 = client.field4273;

      try {
         ++field8964;
         this.field8962 = arg1;
         class546 var5 = this.field8966[(int)((long)(this.field8968 - 1) & arg1)];
         this.field8969 = var5.field7453;
         class546 var6;
         if (var4) {
            if (~this.field8969.field7452 == ~arg1) {
               var6 = this.field8969;
               this.field8969 = this.field8969.field7453;
               return var6;
            }

            this.field8969 = this.field8969.field7453;
         }

         while(true) {
            int var10000;
            if (this.field8969 == var5) {
               this.field8969 = null;
               var10000 = arg0;
               if (!var4) {
                  if (arg0 < 47) {
                     this.field8962 = -128L;
                  }

                  return null;
               }
            } else {
               long var9;
               var10000 = (var9 = ~this.field8969.field7452 - ~arg1) == 0L ? 0 : (var9 < 0L ? -1 : 1);
            }

            if (var10000 == 0) {
               var6 = this.field8969;
               this.field8969 = this.field8969.field7453;
               return var6;
            }

            this.field8969 = this.field8969.field7453;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field8970[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cf",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class634(int arg0) {
      try {
         this.field8966 = new class546[arg0];
         this.field8968 = arg0;

         for(int var2 = 0; ~arg0 < ~var2; ++var2) {
            class546 var3 = this.field8966[var2] = new class546();
            var3.field7451 = var3;
            var3.field7453 = var3;
         }

      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field8970[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4604(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4605(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
