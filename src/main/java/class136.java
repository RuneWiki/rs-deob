import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class136 {
   @OriginalMember(
      owner = "client!ni",
      name = "d",
      descriptor = "I"
   )
   public int field1724 = 128;
   @OriginalMember(
      owner = "client!ni",
      name = "h",
      descriptor = "I"
   )
   public int field1727 = 128;
   @OriginalMember(
      owner = "client!ni",
      name = "l",
      descriptor = "I"
   )
   public int field1725;
   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "I"
   )
   public int field1726;
   @OriginalMember(
      owner = "client!ni",
      name = "b",
      descriptor = "I"
   )
   public int field1730;
   @OriginalMember(
      owner = "client!ni",
      name = "g",
      descriptor = "I"
   )
   public int field1733;
   @OriginalMember(
      owner = "client!ni",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1735 = new String[]{method1142(method1141("\u000fSTc")), method1142(method1141("\u001a\b\u0016!\u0001")), method1142(method1141("\u000fO\u0016KT")), method1142(method1141("\u000fO\u0016LT")), method1142(method1141("\u000fO\u00163\u0015\u000fOL1T")), method1142(method1141("\u000fO\u0016MT")), method1142(method1141("\u000fO\u0016NT"))};
   @OriginalMember(
      owner = "client!ni",
      name = "e",
      descriptor = "I"
   )
   public static int field1734 = 0;
   @OriginalMember(
      owner = "client!ni",
      name = "i",
      descriptor = "I"
   )
   public static int field1722;
   @OriginalMember(
      owner = "client!ni",
      name = "k",
      descriptor = "I"
   )
   public static int field1723;
   @OriginalMember(
      owner = "client!ni",
      name = "f",
      descriptor = "I"
   )
   public static int field1728;
   @OriginalMember(
      owner = "client!ni",
      name = "c",
      descriptor = "I"
   )
   public static int field1729;
   @OriginalMember(
      owner = "client!ni",
      name = "m",
      descriptor = "I"
   )
   public static int field1731;
   @OriginalMember(
      owner = "client!ni",
      name = "j",
      descriptor = "I"
   )
   public static int field1732;

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(IC)C"
   )
   public static final char method1137(int arg0, char arg1) {
      try {
         ++field1723;
         if (arg0 != 0) {
            return 'e';
         } else if (arg1 == 198) {
            return 'E';
         } else if (arg1 == 230) {
            return 'e';
         } else if (~arg1 == -224) {
            return 's';
         } else if (arg1 == 338) {
            return 'E';
         } else {
            return (char)(~arg1 == -340 ? 'e' : '\u0000');
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1735[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(I)Lni;"
   )
   public final class136 method1138(int arg0) {
      try {
         ++field1728;
         int var2 = -10 % ((69 - arg0) / 52);
         return new class136(this.field1725, this.field1724, this.field1727, this.field1726, this.field1730, this.field1733);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1735[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(IIII[BI)Z"
   )
   public static final boolean method1139(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
      boolean var6 = client.field1481;

      try {
         ++field1731;
         boolean var7 = true;
         if (arg2 > -118) {
            method1139(73, 8, 67, -67, (byte[])null, 112);
         }

         class66 var8 = new class66(arg4);
         int var9 = -1;

         boolean var10000;
         while(true) {
            int var10 = var8.method635(0);
            if (var10 != 0) {
               var9 += var10;
               int var11 = 0;
               var10000 = false;
               if (var6) {
                  break;
               }

               boolean var12 = false;

               label85:
               do {
                  byte var10001;
                  int var23;
                  while(true) {
                     if (!var12) {
                        int var13 = var8.method653((byte)-62);
                        var23 = ~var13;
                        var10001 = -1;
                        if (var6) {
                           break;
                        }

                        if (var23 == -1) {
                           break label85;
                        }

                        var11 += var13 + -1;
                        int var14 = var11 & 63;
                        int var15 = (4042 & var11) >> 6;
                        int var16 = var8.method640(255) >> 2;
                        int var17 = arg3 + var15;
                        int var18 = arg1 + var14;
                        if (~var17 >= -1 || ~var18 >= -1 || var17 >= arg0 - 1 || ~var18 <= ~(arg5 + -1)) {
                           continue;
                        }

                        class294 var19 = class438.field5967.method929((byte)-118, var9);
                        if (~var16 == -23 && class757.field11093.field11011.method4665(-18033) == 0 && ~var19.field4079 == -1 && ~var19.field4039 != -2 && !var19.field4091) {
                           continue label85;
                        }

                        var12 = true;
                        if (var19.method2366((byte)19)) {
                           continue;
                        }

                        ++class566.field8338;
                        var7 = false;
                        if (!var6) {
                           continue;
                        }
                     }

                     int var20 = var8.method653((byte)-61);
                     var23 = ~var20;
                     var10001 = -1;
                     break;
                  }

                  if (var23 == var10001) {
                     break;
                  }

                  var8.method640(255);
               } while(!var6);

               if (!var6) {
                  continue;
               }
            }

            var10000 = var7;
            break;
         }

         return var10000;
      } catch (RuntimeException var22) {
         throw class93.method866(var22, field1735[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1735[1] : field1735[0]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "a",
      descriptor = "(Lni;I)V"
   )
   public final void method1140(class136 arg0, int arg1) {
      try {
         this.field1733 = arg0.field1733;
         this.field1727 = arg0.field1727;
         ++field1732;
         this.field1726 = arg0.field1726;
         int var3 = 6 / ((-6 - arg1) / 58);
         this.field1724 = arg0.field1724;
         this.field1730 = arg0.field1730;
         this.field1725 = arg0.field1725;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1735[3] + (arg0 != null ? field1735[1] : field1735[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class136(int arg0) {
      try {
         this.field1725 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1735[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   private class136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field1726 = arg3;
         this.field1727 = arg2;
         this.field1730 = arg4;
         this.field1724 = arg1;
         this.field1725 = arg0;
         this.field1733 = arg5;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field1735[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ni",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1141(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ni",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1142(char[] arg0) {
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
            var10005 = 38;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
