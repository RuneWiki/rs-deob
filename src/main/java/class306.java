import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class306 extends class213 {
   @OriginalMember(
      owner = "client!bq",
      name = "I",
      descriptor = "I"
   )
   private int field4058 = 0;
   @OriginalMember(
      owner = "client!bq",
      name = "L",
      descriptor = "I"
   )
   private int field4062 = 1;
   @OriginalMember(
      owner = "client!bq",
      name = "N",
      descriptor = "I"
   )
   private int field4060 = 0;
   @OriginalMember(
      owner = "client!bq",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4067 = new String[]{method2303(method2302("cfA_")), method2303(method2302("v=\u0003\u001d\u0016")), method2303(method2302("ob\u0003tC")), method2303(method2302("ob\u0003xC")), method2303(method2302("ob\u0003rC")), method2303(method2302("ob\u0003~C")), method2303(method2302("ob\u0003}C")), method2303(method2302("ob\u0003\u007fC"))};
   @OriginalMember(
      owner = "client!bq",
      name = "D",
      descriptor = "Lnw;"
   )
   public static class616 field4061 = new class616(30, 3);
   @OriginalMember(
      owner = "client!bq",
      name = "O",
      descriptor = "Lbga;"
   )
   public static class378 field4064 = new class378(77, -1);
   @OriginalMember(
      owner = "client!bq",
      name = "H",
      descriptor = "Ldia;"
   )
   public static class245 field4065 = new class245(16);
   @OriginalMember(
      owner = "client!bq",
      name = "E",
      descriptor = "I"
   )
   public static int field4066 = 0;
   @OriginalMember(
      owner = "client!bq",
      name = "G",
      descriptor = "I"
   )
   public static int field4055;
   @OriginalMember(
      owner = "client!bq",
      name = "F",
      descriptor = "I"
   )
   public static int field4056;
   @OriginalMember(
      owner = "client!bq",
      name = "J",
      descriptor = "I"
   )
   public static int field4057;
   @OriginalMember(
      owner = "client!bq",
      name = "P",
      descriptor = "I"
   )
   public static int field4059;
   @OriginalMember(
      owner = "client!bq",
      name = "M",
      descriptor = "I"
   )
   public static int field4063;

   @OriginalMember(
      owner = "client!bq",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method1457(int arg0) {
      try {
         class39.method296((byte)56);
         if (arg0 != 28274) {
            field4064 = null;
         }

         ++field4059;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4067[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(JI)V"
   )
   public static final void method2299(long arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         if (class111.field1404 != null) {
            label86: {
               if (class635.field8977 == 1 || ~class635.field8977 == -6) {
                  class730.method5310(true, arg0);
                  if (!var3) {
                     break label86;
                  }
               }

               if (class635.field8977 == 4) {
                  class628.method4565(arg0, -1);
               }
            }
         }

         if (arg1 == 21228) {
            ++field4063;
            class440.method3274(class338.field4832, (long)class369.field5205, true);
            if (~class366.field5168 != 0) {
               class397.method3018(-128, class366.field5168);
            }

            int var4 = 0;
            if (var3) {
               if (class244.field3057[var4]) {
                  class294.field3861[var4] = true;
               }

               class378.field5304[var4] = class244.field3057[var4];
               class244.field3057[var4] = false;
               ++var4;
            }

            while(true) {
               int var10000;
               if (var4 >= class739.field10765) {
                  class373.field5261 = class369.field5205;
                  class578.method4154(-1, (class657)null, -1, (byte)-118);
                  class606.method4427(0, -1, -1, (class657)null);
                  var10000 = ~class366.field5168;
                  if (!var3) {
                     if (var10000 != 0) {
                        class739.field10765 = 0;
                        class483.method3513(-95);
                     }

                     class338.field4832.method593();
                     class447.method3319(class338.field4832, (byte)-16);
                     int var5 = class381.method2930((byte)-27);
                     if (~var5 == 0) {
                        var5 = class325.field4354;
                     }

                     if (var5 == -1) {
                        var5 = class696.field10167;
                     }

                     class727.method5288(92, var5);
                     int var6 = class278.field3709.method3060((byte)38) << 8;
                     class17.method146(class278.field3709.field1001, class278.field3709.field999 + var6, class278.field3709.field1003 + var6, 29037, class291.field3846);
                     class291.field3846 = 0;
                     return;
                  }
               } else {
                  var10000 = class244.field3057[var4];
               }

               if (var10000 != 0) {
                  class294.field3861[var4] = true;
               }

               class378.field5304[var4] = class244.field3057[var4];
               class244.field3057[var4] = false;
               ++var4;
            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4067[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method2300(int arg0) {
      try {
         if (arg0 != 6939) {
            method2300(-87);
         }

         field4065 = null;
         field4061 = null;
         field4064 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4067[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(IBI)V"
   )
   public static final void method2301(int arg0, byte arg1, int arg2) {
      try {
         ++field4057;
         if (arg1 > -59) {
            field4061 = null;
         }

         class446 var3 = class635.method4607(122, (long)arg0, 17);
         var3.method3311(true);
         var3.field6167 = arg2;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field4067[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "<init>",
      descriptor = "()V"
   )
   public class306() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field4055;
         if (arg1 != 2064866508) {
            field4066 = -38;
         }

         int[] var4 = super.field2650.method3769(arg0, -4);
         if (super.field2650.field7140) {
            int var5 = class551.field7586[arg0];
            int var6 = var5 + -2048 >> 1;
            int var7 = 0;
            if (var3 || ~class576.field7916 < ~var7) {
               do {
                  int var10;
                  label42: {
                     int var8 = class534.field7301[var7];
                     int var9 = var8 + -2048 >> 1;
                     if (~this.field4060 == -1) {
                        var10 = (-var5 + var8) * this.field4062;
                        if (!var3) {
                           break label42;
                        }
                     }

                     int var11 = var6 * var6 + var9 * var9 >> 12;
                     int var12 = (int)(Math.sqrt((double)((float)var11 / 4096.0F)) * 4096.0D);
                     var10 = (int)((double)(this.field4062 * var12) * 3.141592653589793D);
                  }

                  int var13 = var10 - (var10 & -4096);
                  if (~this.field4058 == -1) {
                     var13 = class667.field9487[(4091 & var13) >> 4] + 4096 >> 1;
                     if (!var3) {
                        var4[var7] = var13;
                        ++var7;
                        continue;
                     }
                  }

                  if (this.field4058 == 2) {
                     var13 -= 2048;
                     if (~var13 > -1) {
                        var13 = -var13;
                     }

                     var13 = -var13 + 2048 << 1;
                  }

                  var4[var7] = var13;
                  ++var7;
               } while(~class576.field7916 < ~var7);
            }
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field4067[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      try {
         ++field4056;
         int var4 = -29 / ((68 - arg1) / 48);
         if (~arg2 != -1) {
            if (~arg2 == -2) {
               this.field4058 = arg0.method4288((byte)82);
               return;
            }

            if (~arg2 != -4) {
               return;
            }

            if (!client.field4273) {
               this.field4062 = arg0.method4288((byte)69);
               return;
            }
         }

         this.field4060 = arg0.method4288((byte)116);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field4067[2] + (arg0 != null ? field4067[1] : field4067[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2302(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2303(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
