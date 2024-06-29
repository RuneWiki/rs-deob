import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class244 {
   @OriginalMember(
      owner = "client!ab",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3754 = new String[]{method2131(method2130("\tHr`x")), method2131(method2130("\u0013\u0004r\u000f-")), method2131(method2130("\u0006_0M")), method2131(method2130("\tHrbx")), method2131(method2130("\tHrex")), method2131(method2130("\tHrcx"))};
   @OriginalMember(
      owner = "client!ab",
      name = "h",
      descriptor = "I"
   )
   public static int field3745;
   @OriginalMember(
      owner = "client!ab",
      name = "f",
      descriptor = "I"
   )
   public int field3747;
   @OriginalMember(
      owner = "client!ab",
      name = "g",
      descriptor = "I"
   )
   public static int field3748;
   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "I"
   )
   public static int field3749;
   @OriginalMember(
      owner = "client!ab",
      name = "d",
      descriptor = "I"
   )
   private int field3750;
   @OriginalMember(
      owner = "client!ab",
      name = "e",
      descriptor = "I"
   )
   public static int field3751;
   @OriginalMember(
      owner = "client!ab",
      name = "i",
      descriptor = "I"
   )
   public int field3752;
   @OriginalMember(
      owner = "client!ab",
      name = "b",
      descriptor = "I"
   )
   public static int field3753;
   @OriginalMember(
      owner = "client!ab",
      name = "c",
      descriptor = "Lee;"
   )
   public class488 field3746;

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(ILcu;)V"
   )
   public final void method2126(int arg0, class65 arg1) {
      boolean var3 = client.field10022;

      try {
         int var4 = -54 % ((arg0 - -57) / 40);

         while(true) {
            int var5 = arg1.method665(false);
            if (var5 != 0) {
               this.method2129(var5, arg1, -124);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field3748;
            break;
         }

      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field3754[4] + arg0 + ',' + (arg1 != null ? field3754[1] : field3754[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(B)Z"
   )
   public static final boolean method2127(byte arg0) {
      try {
         ++field3753;
         if (arg0 != 25) {
            method2127((byte)119);
         }

         return class528.field7463 != 0;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3754[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(I)Liaa;"
   )
   public final synchronized class433 method2128(int arg0) {
      try {
         ++field3745;
         class433 var2 = (class433)this.field3746.field6969.method1041((long)this.field3750, 8);
         int var3 = -28 / ((33 - arg0) / 56);
         if (var2 != null) {
            return var2;
         } else {
            class433 var4 = class433.method3382(this.field3746.field6967, this.field3750, 0);
            if (var4 != null) {
               this.field3746.field6969.method1050(-104, var4, (long)this.field3750);
            }

            return var4;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3754[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(ILcu;I)V"
   )
   private final void method2129(int arg0, class65 arg1, int arg2) {
      try {
         label31: {
            if (arg0 != 1) {
               if (arg0 != 2) {
                  break label31;
               }

               this.field3747 = arg1.method665(false);
               this.field3752 = arg1.method665(false);
               if (!client.field10022) {
                  break label31;
               }
            }

            this.field3750 = arg1.method685(-2);
         }

         ++field3749;
         if (arg2 > -118) {
            this.method2128(71);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3754[0] + arg0 + ',' + (arg1 != null ? field3754[1] : field3754[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2130(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ab",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2131(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
