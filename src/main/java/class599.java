import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class599 {
   @OriginalMember(
      owner = "client!ul",
      name = "i",
      descriptor = "I"
   )
   private int field8811;
   @OriginalMember(
      owner = "client!ul",
      name = "c",
      descriptor = "Z"
   )
   private boolean field8804;
   @OriginalMember(
      owner = "client!ul",
      name = "k",
      descriptor = "I"
   )
   private int field8808;
   @OriginalMember(
      owner = "client!ul",
      name = "b",
      descriptor = "Z"
   )
   private boolean field8810;
   @OriginalMember(
      owner = "client!ul",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8812 = new String[]{method4360(method4359("r\u001fA-E$")), method4360(method4359("`\u001d\u001f\u0004\u001b")), method4360(method4359("`\u001d\u001f\u0000\u001b")), method4360(method4359("`\u001d\u001f\u0001\u001b")), method4360(method4359("`\u001d\u001f\u0003\u001b")), method4360(method4359("`\u001d\u001f\u0007\u001b")), method4360(method4359("`\u001d\u001f~Z{\u0018E|\u001b")), method4360(method4359("`\u001d\u001f\u0006\u001b"))};
   @OriginalMember(
      owner = "client!ul",
      name = "e",
      descriptor = "[F"
   )
   public static float[] field8803 = new float[4];
   @OriginalMember(
      owner = "client!ul",
      name = "f",
      descriptor = "I"
   )
   public static int field8801;
   @OriginalMember(
      owner = "client!ul",
      name = "d",
      descriptor = "I"
   )
   public static int field8802;
   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "I"
   )
   public static int field8805;
   @OriginalMember(
      owner = "client!ul",
      name = "h",
      descriptor = "I"
   )
   public static int field8807;
   @OriginalMember(
      owner = "client!ul",
      name = "j",
      descriptor = "I"
   )
   public static int field8809;
   @OriginalMember(
      owner = "client!ul",
      name = "g",
      descriptor = "Lkf;"
   )
   public static class266 field8806;

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method4353(boolean arg0) {
      try {
         ++field8809;
         if (arg0) {
            method4354(-74);
         }

         return this.field8811;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8812[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4354(int arg0) {
      try {
         field8806 = null;
         int var1 = -43 % ((arg0 - 88) / 37);
         field8803 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8812[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method4355(int arg0) {
      boolean var1 = client.field4360;

      try {
         ++field8807;
         class534 var2 = class430.field6150.field105;
         var2.method3841(8);
         int var3 = var2.method3844(8, 0);
         if (~class475.field6836 < ~var3) {
            int var4 = var3;
            if (var1 || ~class475.field6836 < ~var3) {
               do {
                  class369.field5086[class434.field6216++] = class352.field4728[var4];
                  ++var4;
               } while(~class475.field6836 < ~var4);
            }
         }

         if (~var3 < ~class475.field6836) {
            throw new RuntimeException(field8812[0]);
         } else {
            class475.field6836 = 0;
            int var5 = arg0;
            if (var1 || arg0 < var3) {
               do {
                  label95: {
                     int var6 = class352.field4728[var5];
                     class506 var7 = ((class529)class328.field4479.method329((byte)127, (long)var6)).field7559;
                     int var8 = var2.method3844(1, 0);
                     if (~var8 == -1) {
                        class352.field4728[class475.field6836++] = var6;
                        var7.field3831 = class743.field10826;
                        if (!var1) {
                           break label95;
                        }
                     }

                     int var9 = var2.method3844(2, 0);
                     if (var9 == 0) {
                        class352.field4728[class475.field6836++] = var6;
                        var7.field3831 = class743.field10826;
                        class271.field3745[class214.field3064++] = var6;
                        if (!var1) {
                           break label95;
                        }
                     }

                     if (~var9 == -2) {
                        class352.field4728[class475.field6836++] = var6;
                        var7.field3831 = class743.field10826;
                        int var10 = var2.method3844(3, 0);
                        var7.method3669(1, -59, var10);
                        int var11 = var2.method3844(1, 0);
                        if (var11 != 1) {
                           break label95;
                        }

                        class271.field3745[class214.field3064++] = var6;
                        if (!var1) {
                           break label95;
                        }
                     }

                     if (~var9 == -3) {
                        label68: {
                           class352.field4728[class475.field6836++] = var6;
                           var7.field3831 = class743.field10826;
                           if (~var2.method3844(1, 0) == -2) {
                              int var12 = var2.method3844(3, 0);
                              var7.method3669(2, -119, var12);
                              int var13 = var2.method3844(3, 0);
                              var7.method3669(2, -127, var13);
                              if (!var1) {
                                 break label68;
                              }
                           }

                           int var14 = var2.method3844(3, 0);
                           var7.method3669(0, arg0 ^ -53, var14);
                        }

                        int var15 = var2.method3844(1, 0);
                        if (var15 != 1) {
                           break label95;
                        }

                        class271.field3745[class214.field3064++] = var6;
                        if (!var1) {
                           break label95;
                        }
                     }

                     if (var9 == 3) {
                        class369.field5086[class434.field6216++] = var6;
                     }
                  }

                  ++var5;
               } while(var5 < var3);

            }
         }
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field8812[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method4356(byte arg0) {
      try {
         ++field8805;
         int var2 = -51 % ((33 - arg0) / 32);
         return this.field8804;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8812[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method4357(int arg0) {
      try {
         if (arg0 != 1) {
            field8806 = null;
         }

         ++field8801;
         return this.field8810;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8812[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "<init>",
      descriptor = "(ZIIZ)V"
   )
   public class599(boolean arg0, int arg1, int arg2, boolean arg3) {
      try {
         this.field8811 = arg1;
         this.field8804 = arg0;
         this.field8808 = arg2;
         this.field8810 = arg3;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8812[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method4358(int arg0) {
      try {
         ++field8802;
         return arg0 >= -101 ? -117 : this.field8808;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8812[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4359(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ul",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4360(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
