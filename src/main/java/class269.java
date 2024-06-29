import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public abstract class class269 extends class109 {
   @OriginalMember(
      owner = "client!mja",
      name = "D",
      descriptor = "S"
   )
   public short field4361;
   @OriginalMember(
      owner = "client!mja",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4368 = new String[]{method2304(method2303("|\u0016\u0016=JPT")), method2304(method2303("jRY=s")), method2304(method2303("\u007f\t\u001b\u007f")), method2304(method2303("|\u0016\u0016=KPT")), method2304(method2303("|\u0016\u0016=MPT")), method2304(method2303("|\u0016\u0016=2x\u0012\u001eg09")), method2304(method2303("|\u0016\u0016=HPT"))};
   @OriginalMember(
      owner = "client!mja",
      name = "L",
      descriptor = "I"
   )
   public static int field4366 = 0;
   @OriginalMember(
      owner = "client!mja",
      name = "H",
      descriptor = "I"
   )
   public static int field4359;
   @OriginalMember(
      owner = "client!mja",
      name = "G",
      descriptor = "I"
   )
   public static int field4360;
   @OriginalMember(
      owner = "client!mja",
      name = "K",
      descriptor = "I"
   )
   public static int field4362;
   @OriginalMember(
      owner = "client!mja",
      name = "I",
      descriptor = "I"
   )
   public static int field4363;
   @OriginalMember(
      owner = "client!mja",
      name = "E",
      descriptor = "I"
   )
   public static int field4364;
   @OriginalMember(
      owner = "client!mja",
      name = "F",
      descriptor = "I"
   )
   public static int field4365;
   @OriginalMember(
      owner = "client!mja",
      name = "J",
      descriptor = "I"
   )
   public static int field4367;

   @OriginalMember(
      owner = "client!mja",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   public class269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field4361 = (short)arg5;
         super.field1505 = arg0;
         super.field1500 = (byte)arg4;
         super.field1506 = (byte)arg3;
         super.field1494 = arg2;
         super.field1495 = arg1;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4368[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(I[Llja;)I"
   )
   public final int method740(int arg0, class404[] arg1) {
      boolean var3 = client.field1786;

      try {
         int var4;
         int var5;
         int var6;
         label115: {
            ++field4367;
            var4 = super.field1505 >> class394.field6180;
            var5 = super.field1494 >> class394.field6180;
            var6 = 0;
            if (class487.field7409 == var4) {
               ++var6;
               if (!var3) {
                  break label115;
               }
            }

            if (class487.field7409 < var4) {
               var6 += 2;
            }
         }

         label110: {
            if (class701.field10446 != var5) {
               if (~var5 <= ~class701.field10446) {
                  break label110;
               }

               var6 += 6;
               if (!var3) {
                  break label110;
               }
            }

            var6 += 3;
         }

         int var7 = class729.field10882[var6];
         if (~(this.field4361 & var7) != -1) {
            return this.method1040(var5, var4, false, arg1);
         } else if (~this.field4361 == -2 && var4 > 0) {
            return this.method1040(var5, var4 + -1, false, arg1);
         } else if (~this.field4361 == -5 && ~var4 >= ~class247.field3734) {
            return this.method1040(var5, var4 + 1, false, arg1);
         } else if (this.field4361 == 8 && ~var5 < -1) {
            return this.method1040(var5 + -1, var4, false, arg1);
         } else if (this.field4361 == 2 && ~class365.field5634 <= ~var5) {
            return this.method1040(var5 + 1, var4, false, arg1);
         } else if (this.field4361 == 16 && ~var4 < -1 && class365.field5634 >= var5) {
            return this.method1040(var5 + 1, var4 - 1, false, arg1);
         } else if (this.field4361 == 32 && ~class247.field3734 <= ~var4 && ~class365.field5634 <= ~var5) {
            return this.method1040(var5 + 1, var4 + 1, false, arg1);
         } else if (this.field4361 == 128 && ~var4 < -1 && ~var5 < -1) {
            return this.method1040(var5 + -1, var4 + -1, false, arg1);
         } else if (this.field4361 == 64 && var4 <= class247.field3734 && ~var5 < -1) {
            return this.method1040(var5 - 1, var4 + 1, false, arg1);
         } else if (arg0 != 27084) {
            return 115;
         } else {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field4368[0] + arg0 + ',' + (arg1 != null ? field4368[1] : field4368[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method2301(int arg0, int arg1) {
      try {
         if (arg0 < 16) {
            return true;
         } else {
            ++field4363;
            return arg1 >= 0 && ~arg1 >= -4 || ~arg1 == -10;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4368[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "i",
      descriptor = "(I)Z"
   )
   public final boolean method738(int arg0) {
      try {
         ++field4365;
         if (arg0 != 0) {
            this.field4361 = 58;
         }

         return class717.field10755[(super.field1505 >> class394.field6180) - class487.field7409 + class382.field6038][(super.field1494 >> class394.field6180) + -class701.field10446 + class382.field6038];
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4368[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "b",
      descriptor = "(Lha;B)Z"
   )
   public final boolean method734(class610 arg0, byte arg1) {
      try {
         ++field4360;
         return arg1 != -59 ? true : class450.method3531((byte)50, this, super.field1500, super.field1494 >> class394.field6180, super.field1505 >> class394.field6180);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4368[4] + (arg0 != null ? field4368[1] : field4368[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(III)Lnc;"
   )
   public static final class462 method2302(int arg0, int arg1, int arg2) {
      class190 var3 = class711.field10694[arg0][arg1][arg2];
      return var3 != null && var3.field2952 != null ? var3.field2952 : null;
   }

   @OriginalMember(
      owner = "client!mja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2303(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2304(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
