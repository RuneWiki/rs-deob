import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public class class97 {
   @OriginalMember(
      owner = "client!wja",
      name = "f",
      descriptor = "I"
   )
   public int field1555 = 0;
   @OriginalMember(
      owner = "client!wja",
      name = "g",
      descriptor = "I"
   )
   public int field1562 = 0;
   @OriginalMember(
      owner = "client!wja",
      name = "e",
      descriptor = "Liw;"
   )
   private class107 field1556 = new class107(64);
   @OriginalMember(
      owner = "client!wja",
      name = "h",
      descriptor = "Lga;"
   )
   private class579 field1564 = null;
   @OriginalMember(
      owner = "client!wja",
      name = "i",
      descriptor = "Lsa;"
   )
   private class39 field1557;
   @OriginalMember(
      owner = "client!wja",
      name = "d",
      descriptor = "Lsa;"
   )
   private class39 field1559;
   @OriginalMember(
      owner = "client!wja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1565 = new String[]{method971(method970(".N\u0018,sq")), method971(method970(".N\u0018,vq")), method971(method970("7Q\u0015n")), method971(method970("\"\nW,J")), method971(method970(".N\u0018,tq")), method971(method970(".N\u0018,uq")), method971(method970(".N\u0018,\u000b0J\u0010v\tq"))};
   @OriginalMember(
      owner = "client!wja",
      name = "c",
      descriptor = "I"
   )
   public static int field1558;
   @OriginalMember(
      owner = "client!wja",
      name = "b",
      descriptor = "I"
   )
   public static int field1560;
   @OriginalMember(
      owner = "client!wja",
      name = "a",
      descriptor = "I"
   )
   public static int field1561;
   @OriginalMember(
      owner = "client!wja",
      name = "j",
      descriptor = "I"
   )
   public static int field1563;

   @OriginalMember(
      owner = "client!wja",
      name = "a",
      descriptor = "(Lbu;[IJI)Ljava/lang/String;"
   )
   public final String method966(class234 arg0, int[] arg1, long arg2, int arg3) {
      try {
         if (arg3 != -3199) {
            this.field1556 = null;
         }

         ++field1561;
         if (this.field1564 != null) {
            String var6 = this.field1564.method2165(arg3 + 3084, arg1, arg2, arg0);
            if (var6 != null) {
               return var6;
            }
         }

         return Long.toString(arg2);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field1565[1] + (arg0 != null ? field1565[3] : field1565[2]) + ',' + (arg1 != null ? field1565[3] : field1565[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "a",
      descriptor = "(BI)Lmu;"
   )
   public final class365 method967(byte arg0, int arg1) {
      try {
         ++field1558;
         class365 var3 = (class365)this.field1556.method1041((long)arg1, 8);
         if (var3 != null) {
            return var3;
         } else {
            byte[] var4;
            label25: {
               if (~arg1 <= -32769) {
                  var4 = this.field1559.method460((byte)-11, 32767 & arg1, 1);
                  if (!client.field10022) {
                     break label25;
                  }
               }

               var4 = this.field1557.method460((byte)-11, arg1, 1);
            }

            class365 var5 = new class365();
            var5.field5398 = this;
            if (var4 != null) {
               var5.method2871(new class65(var4), (byte)4);
            }

            int var6 = -45 % ((arg0 - -37) / 33);
            if (arg1 >= 32768) {
               var5.method2869((byte)24);
            }

            this.field1556.method1050(-108, var5, (long)arg1);
            return var5;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field1565[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "a",
      descriptor = "(IJ)V"
   )
   public static final void method968(int arg0, long arg1) {
      try {
         if (arg0 == 32353) {
            ++field1563;
            if (~arg1 < -1L) {
               if (arg1 % 10L != 0L) {
                  class170.method1584(arg1, 97);
               } else {
                  class170.method1584(arg1 + -1L, arg0 ^ 32282);
                  class170.method1584(1L, 90);
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1565[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "a",
      descriptor = "(ILkaa;)I"
   )
   public static final int method969(int arg0, class158 arg1) {
      boolean var2 = client.field10022;

      try {
         ++field1560;
         int var3 = arg1.field2401;
         class299 var4 = arg1.method3068(-128);
         if (arg0 != -30885) {
            return -22;
         } else {
            int var5 = arg1.field5801.method2218(false);
            if (var5 == -1 || arg1.field5808) {
               var3 = arg1.field2429;
               if (!var2) {
                  return var3;
               }
            }

            if (~var4.field4427 != ~var5 && var4.field4431 != var5 && ~var4.field4462 != ~var5 && var4.field4471 != var5) {
               if (~var4.field4441 != ~var5 && var4.field4443 != var5 && ~var4.field4466 != ~var5 && var4.field4483 != var5) {
                  return var3;
               }

               var3 = arg1.field2435;
               if (!var2) {
                  return var3;
               }
            }

            var3 = arg1.field2406;
            return var3;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1565[4] + arg0 + ',' + (arg1 != null ? field1565[3] : field1565[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "<init>",
      descriptor = "(ILsa;Lsa;Lga;)V"
   )
   public class97(int arg0, class39 arg1, class39 arg2, class579 arg3) {
      try {
         this.field1557 = arg1;
         this.field1559 = arg2;
         this.field1564 = arg3;
         if (this.field1557 != null) {
            this.field1562 = this.field1557.method434((byte)-106, 1);
         }

         if (this.field1559 != null) {
            this.field1555 = this.field1559.method434((byte)-106, 1);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1565[6] + arg0 + ',' + (arg1 != null ? field1565[3] : field1565[2]) + ',' + (arg2 != null ? field1565[3] : field1565[2]) + ',' + (arg3 != null ? field1565[3] : field1565[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method970(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method971(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
