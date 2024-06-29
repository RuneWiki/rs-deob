import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class492 extends class643 {
   @OriginalMember(
      owner = "client!ch",
      name = "o",
      descriptor = "I"
   )
   public int field6768;
   @OriginalMember(
      owner = "client!ch",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   public String field6770;
   @OriginalMember(
      owner = "client!ch",
      name = "q",
      descriptor = "S"
   )
   public short field6766;
   @OriginalMember(
      owner = "client!ch",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6771 = new String[]{method3574(method3573("\u0002\u0018DB]")), method3574(method3573("\u001a^D/\b")), method3574(method3573("\u000f\u0005\u0006m")), method3574(method3573("\u0002\u0018DC]")), method3574(method3573("\u0002\u0018D=\u001c\u000f\u0019\u001e?]")), method3574(method3573("\u0002\u0018D@]"))};
   @OriginalMember(
      owner = "client!ch",
      name = "n",
      descriptor = "I"
   )
   public static int field6769 = 1;
   @OriginalMember(
      owner = "client!ch",
      name = "r",
      descriptor = "I"
   )
   public static int field6764;
   @OriginalMember(
      owner = "client!ch",
      name = "p",
      descriptor = "I"
   )
   public static int field6767;
   @OriginalMember(
      owner = "client!ch",
      name = "s",
      descriptor = "Lhba;"
   )
   public static class10 field6765;

   @OriginalMember(
      owner = "client!ch",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method3570(int arg0) {
      try {
         field6765 = null;
         if (arg0 != -1) {
            field6769 = 121;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6771[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(ZLeb;Z)V"
   )
   public static final void method3571(boolean arg0, class657 arg1, boolean arg2) {
      try {
         if (!arg2) {
            method3571(false, (class657)null, false);
         }

         ++field6767;
         int var3 = ~arg1.field9339 == -1 ? arg1.field9379 : arg1.field9339;
         int var4 = ~arg1.field9243 == -1 ? arg1.field9360 : arg1.field9243;
         class271.method2078(var4, arg0, class468.field6451[arg1.field9220 >> 16], arg1.field9220, -110, var3);
         if (arg1.field9322 != null) {
            class271.method2078(var4, arg0, arg1.field9322, arg1.field9220, 70, var3);
         }

         class588 var5 = (class588)class202.field2476.method1839(-27, (long)arg1.field9220);
         if (var5 != null) {
            class734.method5327(arg0, var3, (byte)-125, var4, var5.field8107);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field6771[0] + arg0 + ',' + (arg1 != null ? field6771[1] : field6771[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method3572(boolean arg0) {
      boolean var1 = client.field4273;

      try {
         if (class338.field4832 != null) {
            if (class775.field11283) {
               class174.method1353(39);
            }

            class46.field528.method260(false);
            class481.method3503();
            class217.method1653(-1);
            class479.method3491(true);
            class245.method1840(0);
            class224.method1718(0);
            if (class256.field3271 != null) {
               class256.field3271.method1813((byte)120);
            }

            class472.method3460(32340);
            class749.method5415(true);
            class380.method2924(1);
            class41.method309((byte)-26);
            class179.method1380(false, 13);
            int var2 = 0;
            if (var1 || ~var2 > -2049) {
               do {
                  class404 var3 = class136.field1773[var2];
                  if (var3 == null) {
                     ++var2;
                  } else {
                     int var4 = 0;
                     if (var1) {
                        var3.field7851[var4] = null;
                        ++var4;
                     }

                     while(var4 < var3.field7851.length) {
                        var3.field7851[var4] = null;
                        ++var4;
                     }

                     ++var2;
                  }
               } while(~var2 > -2049);
            }

            int var5 = 0;
            if (var1 || ~var5 > ~class667.field9489) {
               do {
                  class680 var6 = class270.field3519[var5].field3043;
                  if (var6 == null) {
                     ++var5;
                  } else {
                     int var7 = 0;
                     if (var1) {
                        var6.field7851[var7] = null;
                        ++var7;
                     }

                     while(var6.field7851.length > var7) {
                        var6.field7851[var7] = null;
                        ++var7;
                     }

                     ++var5;
                  }
               } while(~var5 > ~class667.field9489);
            }

            class88.field1124 = null;
            class92.field1230 = null;
            class338.field4832.method559(-10565);
            class338.field4832 = null;
         }

         ++field6764;
         if (!arg0) {
            method3571(true, (class657)null, true);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field6771[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public class492(String arg0, int arg1) {
      try {
         this.field6768 = (int)(class792.method5708(-25005) / 1000L);
         this.field6770 = arg0;
         this.field6766 = (short)arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6771[4] + (arg0 != null ? field6771[1] : field6771[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3573(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ch",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3574(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
