import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class581 {
   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "I"
   )
   public int field8608;
   @OriginalMember(
      owner = "client!fs",
      name = "o",
      descriptor = "I"
   )
   public int field8604;
   @OriginalMember(
      owner = "client!fs",
      name = "l",
      descriptor = "I"
   )
   public int field8595;
   @OriginalMember(
      owner = "client!fs",
      name = "e",
      descriptor = "I"
   )
   public int field8602;
   @OriginalMember(
      owner = "client!fs",
      name = "p",
      descriptor = "B"
   )
   public byte field8609;
   @OriginalMember(
      owner = "client!fs",
      name = "k",
      descriptor = "I"
   )
   public int field8598;
   @OriginalMember(
      owner = "client!fs",
      name = "m",
      descriptor = "I"
   )
   public int field8606;
   @OriginalMember(
      owner = "client!fs",
      name = "c",
      descriptor = "Lvs;"
   )
   public class616 field8610;
   @OriginalMember(
      owner = "client!fs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8611 = new String[]{method4282(method4281("5~#!?")), method4282(method4281("(##3+ 9y1j")), method4282(method4281(" %ac")), method4282(method4281("(##Lj")), method4282(method4281("(##Nj")), method4282(method4281("(##Mj"))};
   @OriginalMember(
      owner = "client!fs",
      name = "g",
      descriptor = "I"
   )
   public static int field8597 = -1;
   @OriginalMember(
      owner = "client!fs",
      name = "i",
      descriptor = "I"
   )
   public static int field8600;
   @OriginalMember(
      owner = "client!fs",
      name = "b",
      descriptor = "I"
   )
   public static int field8601;
   @OriginalMember(
      owner = "client!fs",
      name = "j",
      descriptor = "I"
   )
   public static int field8607;
   @OriginalMember(
      owner = "client!fs",
      name = "f",
      descriptor = "Leg;"
   )
   public class116 field8605;
   @OriginalMember(
      owner = "client!fs",
      name = "d",
      descriptor = "Lvca;"
   )
   public class294 field8599;
   @OriginalMember(
      owner = "client!fs",
      name = "h",
      descriptor = "Ljaa;"
   )
   public class640 field8596;
   @OriginalMember(
      owner = "client!fs",
      name = "n",
      descriptor = "Lic;"
   )
   public class727 field8603;

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method4278(int arg0) {
      try {
         ++field8607;
         int var2 = 121 / ((arg0 - -21) / 54);
         return this.field8609 == 2 || this.field8609 == 3;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8611[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(ILha;)V"
   )
   public static final void method4279(int param0, class66 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fs",
      name = "a",
      descriptor = "(ZLhv;)Lhv;"
   )
   public static final class544 method4280(boolean arg0, class544 arg1) {
      try {
         ++field8601;
         if (!arg0) {
            field8597 = 15;
         }

         class544 var2 = client.method2380(arg1);
         if (var2 == null) {
            var2 = arg1.field7924;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8611[5] + arg0 + ',' + (arg1 != null ? field8611[0] : field8611[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "<init>",
      descriptor = "(BIIIIIILvs;)V"
   )
   public class581(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class616 arg7) {
      try {
         this.field8608 = arg5;
         this.field8604 = arg6;
         this.field8595 = arg3;
         this.field8602 = arg4;
         this.field8609 = arg0;
         this.field8598 = arg2;
         this.field8606 = arg1;
         this.field8610 = arg7;
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field8611[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field8611[0] : field8611[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4281(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4282(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
