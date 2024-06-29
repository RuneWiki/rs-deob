import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class103 {
   @OriginalMember(
      owner = "client!pia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1688 = new String[]{method975(method974("zg\u001c&")), method975(method974("d{\u0011dR<")), method975(method974("o<^dl")), method975(method974("d{\u0011dS<")), method975(method974("d{\u0011dT<")), method975(method974("d{\u0011dU<")), method975(method974("d{\u0011dP<"))};
   @OriginalMember(
      owner = "client!pia",
      name = "j",
      descriptor = "I"
   )
   public static int field1686 = 0;
   @OriginalMember(
      owner = "client!pia",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field1685 = new int[5];
   @OriginalMember(
      owner = "client!pia",
      name = "e",
      descriptor = "I"
   )
   public static int field1682 = 0;
   @OriginalMember(
      owner = "client!pia",
      name = "i",
      descriptor = "I"
   )
   public static int field1677;
   @OriginalMember(
      owner = "client!pia",
      name = "c",
      descriptor = "I"
   )
   public static int field1678;
   @OriginalMember(
      owner = "client!pia",
      name = "d",
      descriptor = "I"
   )
   public static int field1679;
   @OriginalMember(
      owner = "client!pia",
      name = "b",
      descriptor = "I"
   )
   private int field1680;
   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "I"
   )
   public static int field1681;
   @OriginalMember(
      owner = "client!pia",
      name = "g",
      descriptor = "I"
   )
   public int field1683;
   @OriginalMember(
      owner = "client!pia",
      name = "h",
      descriptor = "I"
   )
   public int field1684;
   @OriginalMember(
      owner = "client!pia",
      name = "f",
      descriptor = "Luga;"
   )
   public class218 field1687;

   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "(Lkk;I)V",
      line = 7
   )
   public static final void method969(class200 param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "(Luda;Z)V",
      line = 191
   )
   public final void method970(class473 arg0, boolean arg1) {
      boolean var3 = client.field4564;

      try {
         ++field1678;
         if (arg1) {
            method969((class200)null, 79);
         }

         do {
            int var4 = arg0.method3564((byte)-117);
            if (~var4 == -1) {
               break;
            }

            this.method973(var4, true, arg0);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1688[1] + (arg0 != null ? field1688[2] : field1688[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "(I)V",
      line = 212
   )
   public static void method971(int arg0) {
      try {
         if (arg0 == 0) {
            field1685 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1688[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "(B)Ltn;",
      line = 230
   )
   public final synchronized class94 method972(byte arg0) {
      try {
         ++field1681;
         class94 var2 = (class94)this.field1687.field3302.method1584((long)this.field1680, 1);
         if (arg0 != 24) {
            this.field1684 = 121;
         }

         if (var2 != null) {
            return var2;
         } else {
            class94 var3 = class94.method913(this.field1687.field3290, this.field1680, 0);
            if (var3 != null) {
               this.field1687.field3302.method1581((long)this.field1680, arg0 + -24, var3);
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1688[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "(IZLuda;)V",
      line = 256
   )
   private final void method973(int arg0, boolean arg1, class473 arg2) {
      try {
         if (!arg1) {
            this.method972((byte)37);
         }

         label29: {
            if (arg0 == 1) {
               this.field1680 = arg2.method3565(arg1);
               if (!client.field4564) {
                  break label29;
               }
            }

            if (arg0 == 2) {
               this.field1684 = arg2.method3564((byte)-58);
               this.field1683 = arg2.method3564((byte)-103);
            }
         }

         ++field1677;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1688[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1688[2] : field1688[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method974(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method975(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
