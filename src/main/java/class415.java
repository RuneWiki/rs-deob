import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class415 extends class213 {
   @OriginalMember(
      owner = "client!fu",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5984 = new String[]{method3106(method3105("\u0016P't")), method3106(method3105("MS7zI")), method3106(method3105("P\b7\u0016\u001c")), method3106(method3105("X\bu8")), method3106(method3105("P\b7\u0017\u001c")), method3106(method3105("P\b7\u0015\u001c")), method3106(method3105("P\b7\u0010\u001c"))};
   @OriginalMember(
      owner = "client!fu",
      name = "z",
      descriptor = "I"
   )
   public static int field5977;
   @OriginalMember(
      owner = "client!fu",
      name = "w",
      descriptor = "I"
   )
   public static int field5978;
   @OriginalMember(
      owner = "client!fu",
      name = "x",
      descriptor = "I"
   )
   public static int field5979;
   @OriginalMember(
      owner = "client!fu",
      name = "v",
      descriptor = "I"
   )
   public static int field5981;
   @OriginalMember(
      owner = "client!fu",
      name = "u",
      descriptor = "I"
   )
   public static int field5982;
   @OriginalMember(
      owner = "client!fu",
      name = "t",
      descriptor = "I"
   )
   public static int field5983;
   @OriginalMember(
      owner = "client!fu",
      name = "y",
      descriptor = "Ljava/lang/String;"
   )
   private String field5980;

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(Lqv;Z)V"
   )
   public final void method1343(class472 arg0, boolean arg1) {
      try {
         arg0.field6793 = this.field5980;
         ++field5982;
         if (!arg1) {
            field5979 = 97;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5984[5] + (arg0 != null ? field5984[1] : field5984[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(Lwf;B)V"
   )
   public final void method1347(class147 arg0, byte arg1) {
      try {
         if (arg1 <= -38) {
            this.field5980 = arg0.method1204(2119550368);
            ++field5981;
            arg0.method1164(19693);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5984[4] + (arg0 != null ? field5984[1] : field5984[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method3103(int arg0) {
      try {
         ++field5978;
         return arg0 < 68 ? 38 : class2.field9;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5984[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "a",
      descriptor = "(Lbl;III)V"
   )
   public static final void method3104(class678 arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field4360;

      try {
         if (class613.field9015) {
            class649 var5 = ~class260.field3611 == 0 ? null : class327.field4469.method1334(class260.field3611, (byte)-83);
            if (client.method2351(arg0).method2173(-1247933578) && (class375.field5425 & 32) != 0 && (var5 == null || ~arg0.method4941(var5.field9474, (byte)-100, class260.field3611) != ~var5.field9474)) {
               class655.method4799(class198.field2816, false, class37.field523 + field5984[0] + arg0.field9861, false, (long)(arg0.field9965 << 0 | arg0.field9854), arg0.field9854, 123, arg0.field9965, 0L, true, 2, class14.field160, arg0.field9912);
               ++class278.field3786;
            }
         }

         ++field5983;
         int var6 = 9;
         String var7;
         if (arg3 <= 122) {
            field5979 = -12;
            if (var4) {
               var7 = class522.method3788(arg0, (byte)-67, var6);
               if (var7 != null) {
                  ++class766.field11302;
                  class655.method4799(var7, false, arg0.field9861, false, (long)(arg0.field9965 << 0 | arg0.field9854), arg0.field9854, 87, arg0.field9965, (long)(var6 + 1), true, 1006, class68.method638(arg0, var6, (byte)13), arg0.field9912);
               }

               --var6;
            }
         }

         while(true) {
            String var10000;
            if (~var6 > -6) {
               var7 = class352.method2567(arg0, 2);
               var10000 = var7;
               if (!var4) {
                  if (var7 != null) {
                     class655.method4799(var7, false, arg0.field9861, false, (long)(arg0.field9854 | arg0.field9965 << 0), arg0.field9854, 84, arg0.field9965, 0L, true, 15, arg0.field9925, arg0.field9912);
                     ++class56.field689;
                  }

                  int var8 = 4;
                  String var9;
                  if (var4) {
                     var9 = class522.method3788(arg0, (byte)-106, var8);
                     if (var9 != null) {
                        ++class766.field11302;
                        class655.method4799(var9, false, arg0.field9861, false, (long)(arg0.field9854 | arg0.field9965 << 0), arg0.field9854, 82, arg0.field9965, (long)(var8 + 1), true, 48, class68.method638(arg0, var8, (byte)13), arg0.field9912);
                     }

                     --var8;
                  }

                  while(true) {
                     class678 var12;
                     if (var8 < 0) {
                        var12 = arg0;
                        if (!var4) {
                           if (!client.method2351(arg0).method2174(-18890)) {
                              return;
                           }

                           label66: {
                              if (arg0.field9963 != null) {
                                 class655.method4799(arg0.field9963, false, "", false, (long)(arg0.field9854 | arg0.field9965 << 0), arg0.field9854, 66, arg0.field9965, 0L, true, 25, -1, arg0.field9912);
                                 if (!var4) {
                                    break label66;
                                 }
                              }

                              class655.method4799(class180.field2489.method1437(class608.field8920, 50), false, "", false, (long)(arg0.field9854 | arg0.field9965 << 0), arg0.field9854, 92, arg0.field9965, 0L, true, 25, -1, arg0.field9912);
                           }

                           ++class18.field207;
                           return;
                        }
                     } else {
                        var12 = arg0;
                     }

                     var9 = class522.method3788(var12, (byte)-106, var8);
                     if (var9 != null) {
                        ++class766.field11302;
                        class655.method4799(var9, false, arg0.field9861, false, (long)(arg0.field9854 | arg0.field9965 << 0), arg0.field9854, 82, arg0.field9965, (long)(var8 + 1), true, 48, class68.method638(arg0, var8, (byte)13), arg0.field9912);
                     }

                     --var8;
                  }
               }
            } else {
               var7 = class522.method3788(arg0, (byte)-67, var6);
               var10000 = var7;
            }

            if (var10000 != null) {
               ++class766.field11302;
               class655.method4799(var7, false, arg0.field9861, false, (long)(arg0.field9965 << 0 | arg0.field9854), arg0.field9854, 87, arg0.field9965, (long)(var6 + 1), true, 1006, class68.method638(arg0, var6, (byte)13), arg0.field9912);
            }

            --var6;
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field5984[2] + (arg0 != null ? field5984[1] : field5984[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3105(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3106(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
