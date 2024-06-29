import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public abstract class class667 extends class109 {
   @OriginalMember(
      owner = "client!cu",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9985 = new String[]{method4925(method4924(";\u001bvYO")), method4925(method4924(";\u001bvY&p")), method4925(method4924(";\u001bv_&p")), method4925(method4924("#@v2\u001a")), method4925(method4924("6\u001b4p")), method4925(method4924(";\u001bvQO")), method4925(method4924(";\u001bv \u000e6\u0007,\"O")), method4925(method4924(";\u001bvX&p")), method4925(method4924(";\u001bv]O")), method4925(method4924(";\u001bv_O"))};
   @OriginalMember(
      owner = "client!cu",
      name = "K",
      descriptor = "I"
   )
   public static int field9984 = 0;
   @OriginalMember(
      owner = "client!cu",
      name = "H",
      descriptor = "I"
   )
   public static int field9977;
   @OriginalMember(
      owner = "client!cu",
      name = "F",
      descriptor = "I"
   )
   public static int field9978;
   @OriginalMember(
      owner = "client!cu",
      name = "D",
      descriptor = "I"
   )
   public static int field9979;
   @OriginalMember(
      owner = "client!cu",
      name = "G",
      descriptor = "I"
   )
   public static int field9980;
   @OriginalMember(
      owner = "client!cu",
      name = "I",
      descriptor = "I"
   )
   public static int field9981;
   @OriginalMember(
      owner = "client!cu",
      name = "E",
      descriptor = "I"
   )
   public static int field9982;
   @OriginalMember(
      owner = "client!cu",
      name = "J",
      descriptor = "I"
   )
   public static int field9983;

   @OriginalMember(
      owner = "client!cu",
      name = "b",
      descriptor = "(Lha;B)Z"
   )
   public final boolean method734(class610 arg0, byte arg1) {
      try {
         ++field9980;
         class605 var3 = class396.method3196(super.field1506, super.field1505 >> class394.field6180, super.field1494 >> class394.field6180);
         if (arg1 != -59) {
            this.method57(-28);
         }

         return var3 != null && var3.field8839.field1038 ? class299.method2506(var3.field8839.method230(2) - -this.method230(2), super.field1505 >> class394.field6180, false, super.field1494 >> class394.field6180, super.field1506) : client.method1174(super.field1494 >> class394.field6180, super.field1506, super.field1505 >> class394.field6180, 84);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9985[2] + (arg0 != null ? field9985[3] : field9985[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "(I[Llja;)I"
   )
   public final int method740(int arg0, class404[] arg1) {
      try {
         if (arg0 != 27084) {
            field9984 = -25;
         }

         ++field9978;
         return this.method1040(super.field1494 >> class394.field6180, super.field1505 >> class394.field6180, false, arg1);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9985[7] + arg0 + ',' + (arg1 != null ? field9985[3] : field9985[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "(Lfq;I)Lfq;"
   )
   public static final class374 method4923(class374 arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field9981;
         if (~arg0.field5830 != 0) {
            return class183.method1658(arg0.field5830, 112);
         } else {
            int var3 = arg0.field5840 >>> 16;
            class528 var4 = new class528(class507.field7766);
            class276 var5 = (class276)var4.method4057(5);
            if (var2) {
               if (~var5.field4404 == ~var3) {
                  return class183.method1658((int)var5.field4655, 122);
               }

               var5 = (class276)var4.method4058(126);
            }

            while(true) {
               while(var5 != null) {
                  if (~var5.field4404 == ~var3) {
                     return class183.method1658((int)var5.field4655, 122);
                  }

                  var5 = (class276)var4.method4058(126);
               }

               int var6 = 94 % ((arg1 - -58) / 51);
               if (!var2) {
                  return null;
               }

               var5 = (class276)var4.method4058(126);
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9985[5] + (arg0 != null ? field9985[3] : field9985[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "(IIILha;ZILbaa;)V"
   )
   public final void method44(int arg0, int arg1, int arg2, class610 arg3, boolean arg4, int arg5, class109 arg6) {
      try {
         ++field9979;
         if (arg1 == 0) {
            throw new IllegalStateException();
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field9985[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9985[3] : field9985[4]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9985[3] : field9985[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "<init>",
      descriptor = "(IIIII)V"
   )
   public class667(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         super.field1506 = (byte)arg3;
         super.field1495 = arg1;
         super.field1505 = arg0;
         super.field1494 = arg2;
         super.field1500 = (byte)arg4;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field9985[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method57(int arg0) {
      try {
         int var2 = 111 / ((-51 - arg0) / 60);
         ++field9983;
         throw new IllegalStateException();
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9985[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "d",
      descriptor = "(B)Z"
   )
   public final boolean method45(byte arg0) {
      try {
         ++field9977;
         if (arg0 > -108) {
            field9984 = 4;
         }

         return false;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9985[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "i",
      descriptor = "(I)Z"
   )
   public final boolean method738(int arg0) {
      try {
         if (arg0 != 0) {
            field9984 = 88;
         }

         ++field9982;
         return class717.field10755[(super.field1505 >> class394.field6180) + -class487.field7409 + class382.field6038][(super.field1494 >> class394.field6180) - -class382.field6038 + -class701.field10446];
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9985[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4924(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4925(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
