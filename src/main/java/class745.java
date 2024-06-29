import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class745 {
   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "Lrr;"
   )
   private class678 field11060;
   @OriginalMember(
      owner = "client!iaa",
      name = "g",
      descriptor = "Lrr;"
   )
   private class678 field11062;
   @OriginalMember(
      owner = "client!iaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11067 = new String[]{method5478(method5477("\u0000=0\u0002\u0000A")), method5478(method5477("\u0000=0\u0002\u0001A")), method5478(method5477("\u0007)=@")), method5478(method5477("\u0012r\u007f\u0002>")), method5478(method5477("\u0000=0\u0002\u007f\u000028X}A")), method5478(method5477("\u0000=0\u0002\u0002A"))};
   @OriginalMember(
      owner = "client!iaa",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field11059 = false;
   @OriginalMember(
      owner = "client!iaa",
      name = "h",
      descriptor = "I"
   )
   public static int field11066 = -1;
   @OriginalMember(
      owner = "client!iaa",
      name = "d",
      descriptor = "I"
   )
   public static int field11061;
   @OriginalMember(
      owner = "client!iaa",
      name = "b",
      descriptor = "I"
   )
   public static int field11063;
   @OriginalMember(
      owner = "client!iaa",
      name = "c",
      descriptor = "I"
   )
   public static int field11064;
   @OriginalMember(
      owner = "client!iaa",
      name = "e",
      descriptor = "Lfia;"
   )
   private class529 field11065;

   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "(ILm;)Lam;",
      line = 3
   )
   public final class272 method5473(int arg0, class26 arg1) {
      try {
         ++field11063;
         if (arg1 == null) {
            return null;
         } else {
            class783 var3 = arg1.method193(arg0 ^ -8994);
            if (class716.field10728 == var3) {
               return new class300((class512)arg1);
            } else if (class147.field2205 == var3) {
               return new class200(this.method5476(arg0 + 8593), (class696)arg1);
            } else if (class82.field1164 == var3) {
               return new class230(this.field11062, (class407)arg1);
            } else if (class759.field11226 == var3) {
               return new class505(this.field11062, (class342)arg1);
            } else if (class751.field11145 == var3) {
               return new class341(this.field11062, this.field11060, (class725)arg1);
            } else if (class696.field10344 == var3) {
               return new class487(this.field11062, this.field11060, (class714)arg1);
            } else {
               if (arg0 != 8993) {
                  this.method5473(71, (class26)null);
               }

               if (class288.field4528 == var3) {
                  return new class465(this.field11062, this.field11060, (class598)arg1);
               } else if (class650.field9377 == var3) {
                  return new class368(this.field11062, this.field11060, (class665)arg1);
               } else if (class186.field2916 == var3) {
                  return new class614(this.field11062, (class787)arg1);
               } else {
                  return class133.field1892 == var3 ? new class351(this.field11062, this.field11060, (class594)arg1) : null;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11067[5] + arg0 + ',' + (arg1 != null ? field11067[3] : field11067[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "(Lbaa;Z[[[BIB)Z",
      line = 61
   )
   public static final boolean method5474(class109 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
      if (!class492.field7436) {
         return false;
      } else {
         int var5 = arg0.field1505 >> class394.field6180;
         int var6 = var5;
         int var7 = arg0.field1494 >> class394.field6180;
         int var8 = var7;
         if (arg0 instanceof class78) {
            var6 = ((class78)arg0).field1042;
            var8 = ((class78)arg0).field1049;
            var5 = ((class78)arg0).field1040;
            var7 = ((class78)arg0).field1044;
         }

         for(int var9 = var5; var9 <= var6; ++var9) {
            for(int var10 = var7; var10 <= var8; ++var10) {
               if (arg0.field1500 < class461.field7016 && var9 >= class356.field5484 && var9 < class713.field10706 && var10 >= class775.field11389 && var10 < class35.field421) {
                  if ((arg2 == null || arg0.field1506 < arg3 || arg2[arg0.field1506][var9][var10] != arg4) && arg0.method738(0) && !arg0.method734(class546.field8193, (byte)-59)) {
                     return false;
                  }

                  if (!arg1 && var9 >= class487.field7409 - 16 && var9 <= class487.field7409 + 16 && var10 >= class701.field10446 - 16 && var10 <= class701.field10446 + 16) {
                     if (class116.field1566) {
                        class659.field9842[class384.field6049++].method3542(arg0, (byte)86);
                        class384.field6049 %= class571.field8459;
                     } else {
                        arg0.method49(class546.field8193, -16);
                     }
                  }
               }
            }
         }

         return true;
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "(IIIZ)V",
      line = 127
   )
   public static final void method5475(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         if (class570.field8426.method3141((long)arg0, true) == null) {
            label21: {
               if (class715.field10718) {
                  class332 var4 = new class332(arg0, new class579(4096, class609.field8868, arg0), arg2, arg3);
                  var4.field5035.method4094((byte)-112, class227.field3455[class493.field7455]);
                  class570.field8426.method3143(arg1 ^ 118, var4, (long)arg0);
                  if (!client.field1786) {
                     break label21;
                  }
               }

               class781.method5679(false, arg0, arg3);
            }
         }

         if (arg1 != 16) {
            method5475(73, 52, 58, true);
         }

         ++field11064;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11067[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "(I)Lfia;",
      line = 154
   )
   private final class529 method5476(int arg0) {
      try {
         if (arg0 != 17586) {
            return null;
         } else {
            ++field11061;
            if (this.field11065 == null) {
               this.field11065 = new class529();
            }

            return this.field11065;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11067[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "<init>",
      descriptor = "(Lrr;Lrr;)V",
      line = 169
   )
   public class745(class678 arg0, class678 arg1) {
      try {
         this.field11060 = arg1;
         this.field11062 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11067[4] + (arg0 != null ? field11067[3] : field11067[2]) + ',' + (arg1 != null ? field11067[3] : field11067[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5477(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5478(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
