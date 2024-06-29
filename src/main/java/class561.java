import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class class561 {
   @OriginalMember(
      owner = "client!de",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7694 = new String[]{method4044(method4043("A\u0018h}\u0004")), method4044(method4043("A\u0018h~\u0004")), method4044(method4043("A\u0018hx\u0004")), method4044(method4043("A\u0018hy\u0004")), method4044(method4043("K\b*V")), method4044(method4043("^Sh\u0014Q")), method4044(method4043("A\u0018h\u007f\u0004")), method4044(method4043("A\u0018h{\u0004")), method4044(method4043("A\u0018h|\u0004"))};
   @OriginalMember(
      owner = "client!de",
      name = "c",
      descriptor = "Ldia;"
   )
   public static class245 field7692 = new class245(8);
   @OriginalMember(
      owner = "client!de",
      name = "j",
      descriptor = "I"
   )
   public static int field7684;
   @OriginalMember(
      owner = "client!de",
      name = "g",
      descriptor = "I"
   )
   public static int field7685;
   @OriginalMember(
      owner = "client!de",
      name = "h",
      descriptor = "I"
   )
   public int field7686;
   @OriginalMember(
      owner = "client!de",
      name = "a",
      descriptor = "I"
   )
   public int field7687;
   @OriginalMember(
      owner = "client!de",
      name = "i",
      descriptor = "I"
   )
   public int field7688;
   @OriginalMember(
      owner = "client!de",
      name = "b",
      descriptor = "I"
   )
   public static int field7689;
   @OriginalMember(
      owner = "client!de",
      name = "f",
      descriptor = "I"
   )
   public static int field7690;
   @OriginalMember(
      owner = "client!de",
      name = "d",
      descriptor = "I"
   )
   public static int field7691;
   @OriginalMember(
      owner = "client!de",
      name = "e",
      descriptor = "I"
   )
   public static int field7693;

   @OriginalMember(
      owner = "client!de",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4036(int arg0) {
      try {
         if (arg0 == 1) {
            field7692 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7694[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!de",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method4037(int arg0) {
      try {
         if (arg0 != -1) {
            this.field7686 = -125;
         }

         ++field7693;
         return (8 & this.field7688) != 0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7694[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!de",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method4038(int param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!de",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method4039(int arg0) {
      try {
         if (arg0 != -1) {
            method4040(13, (class657)null);
         }

         ++field7691;
         return ~(4 & this.field7688) != -1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7694[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!de",
      name = "a",
      descriptor = "(ILeb;)V"
   )
   public static final void method4040(int arg0, class657 arg1) {
      try {
         ++field7689;
         if (class221.field2764) {
            ++class313.field4173;
            if (arg1.field9297 != null) {
               class657 var2 = class728.method5295(class593.field8208, class226.field2837, -1);
               if (var2 != null) {
                  class589 var3 = new class589();
                  var3.field8116 = arg1.field9297;
                  var3.field8124 = var2;
                  var3.field8110 = arg1;
                  class16.method121(var3);
               }
            }

            class471 var4 = class133.method1118(class605.field8474.field2787, 2, class505.field6918);
            var4.field6527.method4337(arg1.field9220, 1184007664);
            var4.field6527.method4308(true, class226.field2837);
            var4.field6527.method4274(-1165420232, class110.field1389);
            var4.field6527.method4274(-1165420232, arg1.field9345);
            var4.field6527.method4315(-1525584184, class593.field8208);
            var4.field6527.method4314(-53, arg1.field9285);
            if (arg0 <= 75) {
               field7692 = null;
            }

            class605.field8474.method1702((byte)-46, var4);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7694[3] + arg0 + ',' + (arg1 != null ? field7694[5] : field7694[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!de",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method4041(int arg0) {
      try {
         ++field7690;
         if (arg0 != 65535) {
            this.field7688 = 102;
         }

         return ~(2 & this.field7688) != -1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7694[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!de",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method4042(int arg0) {
      try {
         ++field7685;
         int var2 = 11 / ((arg0 - 6) / 52);
         return ~(1 & this.field7688) != -1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7694[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!de",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4043(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!de",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4044(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
