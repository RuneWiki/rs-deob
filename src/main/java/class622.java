import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class622 {
   @OriginalMember(
      owner = "client!nu",
      name = "l",
      descriptor = "I"
   )
   public int field8686 = -1;
   @OriginalMember(
      owner = "client!nu",
      name = "e",
      descriptor = "I"
   )
   public int field8688 = -1;
   @OriginalMember(
      owner = "client!nu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8693 = new String[]{method4528(method4527("Ul\u0002 ")), method4528(method4527("@7@bl")), method4528(method4527("Ul@\r9")), method4528(method4527("Ul@\t9")), method4528(method4527("L~")), method4528(method4527("Ul@\u000f9")), method4528(method4527("Ul@\b9")), method4528(method4527("Ul@\u000e9")), method4528(method4527("Ul@\n9"))};
   @OriginalMember(
      owner = "client!nu",
      name = "h",
      descriptor = "Ltga;"
   )
   public static class63 field8682 = new class63(4);
   @OriginalMember(
      owner = "client!nu",
      name = "c",
      descriptor = "Ltv;"
   )
   public static class590 field8690 = new class590(10);
   @OriginalMember(
      owner = "client!nu",
      name = "j",
      descriptor = "I"
   )
   public static int field8681;
   @OriginalMember(
      owner = "client!nu",
      name = "g",
      descriptor = "I"
   )
   public static int field8683;
   @OriginalMember(
      owner = "client!nu",
      name = "i",
      descriptor = "I"
   )
   public static int field8684;
   @OriginalMember(
      owner = "client!nu",
      name = "b",
      descriptor = "I"
   )
   public static int field8685;
   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "I"
   )
   public static int field8687;
   @OriginalMember(
      owner = "client!nu",
      name = "d",
      descriptor = "Lok;"
   )
   public static class267 field8692;
   @OriginalMember(
      owner = "client!nu",
      name = "f",
      descriptor = "[I"
   )
   public int[] field8689;
   @OriginalMember(
      owner = "client!nu",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field8691;

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(Lwm;BI)V"
   )
   private final void method4521(class594 param1, byte param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nu",
      name = "b",
      descriptor = "(I)Lwm;"
   )
   public static final class594 method4522(int arg0) {
      try {
         ++field8681;
         class594 var1 = new class594(518);
         class42.field483 = new int[4];
         class42.field483[3] = (int)(Math.random() * 9.9999999E7D);
         class42.field483[0] = (int)(9.9999999E7D * Math.random());
         class42.field483[2] = (int)(Math.random() * 9.9999999E7D);
         class42.field483[1] = (int)(9.9999999E7D * Math.random());
         var1.method4318(10, 0);
         var1.method4337(class42.field483[0], arg0 + 1184007662);
         var1.method4337(class42.field483[1], 1184007664);
         var1.method4337(class42.field483[arg0], 1184007664);
         var1.method4337(class42.field483[3], arg0 + 1184007662);
         return var1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8693[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4523(int arg0) {
      try {
         field8690 = null;
         field8682 = null;
         field8691 = null;
         field8692 = null;
         if (arg0 != 10) {
            field8691 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8693[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "([BZI)Ljava/lang/Object;"
   )
   public static final Object method4524(byte[] arg0, boolean arg1, int arg2) {
      try {
         int var3 = -61 / ((arg2 - 14) / 44);
         ++field8684;
         if (arg0 == null) {
            return null;
         } else {
            if (arg0.length > 136 && !class744.field10827) {
               try {
                  class205 var4 = (class205)Class.forName(field8693[4]).newInstance();
                  var4.method1550(arg0, (byte)111);
                  return var4;
               } catch (Throwable var6) {
                  class744.field10827 = true;
               }
            }

            return !arg1 ? arg0 : class170.method1330((byte)-124, arg0);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field8693[3] + (arg0 != null ? field8693[1] : field8693[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(ILwm;)V"
   )
   public final void method4525(int arg0, class594 arg1) {
      boolean var3 = client.field4273;

      try {
         int var4 = 19 % ((64 - arg0) / 58);

         while(true) {
            int var5 = arg1.method4288((byte)118);
            if (~var5 != -1) {
               this.method4521(arg1, (byte)-101, var5);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field8683;
            break;
         }

      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field8693[8] + arg0 + ',' + (arg1 != null ? field8693[1] : field8693[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(Lwm;I)V"
   )
   public static final void method4526(class594 arg0, int arg1) {
      boolean var2 = client.field4273;

      try {
         ++field8685;
         int var3 = arg0.method4338(false);
         class233.field2891 = new class503[var3];
         int var4 = 0;
         if (var2) {
            class233.field2891[var4] = new class503();
            class233.field2891[var4].field6893 = arg0.method4338(false);
            class233.field2891[var4].field6898 = arg0.method4325(false);
            ++var4;
         }

         while(true) {
            while(var4 < var3) {
               class233.field2891[var4] = new class503();
               class233.field2891[var4].field6893 = arg0.method4338(false);
               class233.field2891[var4].field6898 = arg0.method4325(false);
               ++var4;
            }

            class532.field7285 = arg0.method4338(false);
            class697.field10180 = arg0.method4338(false);
            class567.field7738 = arg0.method4338(false);
            class580.field7961 = new class78[-class532.field7285 + class697.field10180 + 1];
            int var5 = 0;
            if (!var2) {
               int var10000;
               if (var2) {
                  var10000 = arg0.method4338(false);
               } else if (var5 >= class567.field7738) {
                  class642.field9025 = arg0.method4302(true);
                  var10000 = arg1;
                  if (!var2) {
                     if (arg1 != -3) {
                        return;
                     }

                     class630.field8821 = true;
                     return;
                  }
               } else {
                  var10000 = arg0.method4338(false);
               }

               while(true) {
                  int var6 = var10000;
                  class78 var7 = class580.field7961[var6] = new class78();
                  var7.field7686 = arg0.method4288((byte)87);
                  var7.field7688 = arg0.method4302(true);
                  var7.field971 = class532.field7285 + var6;
                  var7.field975 = arg0.method4325(false);
                  var7.field968 = arg0.method4325(false);
                  ++var5;
                  if (var5 >= class567.field7738) {
                     class642.field9025 = arg0.method4302(true);
                     var10000 = arg1;
                     if (!var2) {
                        if (arg1 != -3) {
                           return;
                        }

                        class630.field8821 = true;
                        return;
                     }
                  } else {
                     var10000 = arg0.method4338(false);
                  }
               }
            }

            ++var4;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field8693[7] + (arg0 != null ? field8693[1] : field8693[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4527(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4528(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
