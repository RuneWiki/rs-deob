import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class class629 {
   @OriginalMember(
      owner = "client!pb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9108 = new String[]{method4611(method4610("bj:t&")), method4611(method4610("bj:q&")), method4611(method4610("bj:p&")), method4611(method4610("bj:u&")), method4611(method4610("bj:w&")), method4611(method4610("|}x^")), method4611(method4610(".k{^3tnrT>\"6")), method4611(method4610("i&:\u001cs")), method4611(method4610("2 ")), method4611(method4610("2%*\u00122qgx\u000fhtnr\u0002>,")), method4611(method4610("bj:s&")), method4611(method4610("bj:v&")), method4611(method4610("bj:z&"))};
   @OriginalMember(
      owner = "client!pb",
      name = "e",
      descriptor = "Lnaa;"
   )
   public static class113 field9106 = new class113(85, 3);
   @OriginalMember(
      owner = "client!pb",
      name = "i",
      descriptor = "I"
   )
   public int field9096;
   @OriginalMember(
      owner = "client!pb",
      name = "b",
      descriptor = "I"
   )
   public static int field9097;
   @OriginalMember(
      owner = "client!pb",
      name = "l",
      descriptor = "I"
   )
   public static int field9098;
   @OriginalMember(
      owner = "client!pb",
      name = "j",
      descriptor = "I"
   )
   public static int field9099;
   @OriginalMember(
      owner = "client!pb",
      name = "g",
      descriptor = "I"
   )
   public int field9100;
   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "I"
   )
   public static int field9101;
   @OriginalMember(
      owner = "client!pb",
      name = "c",
      descriptor = "I"
   )
   public static int field9102;
   @OriginalMember(
      owner = "client!pb",
      name = "m",
      descriptor = "I"
   )
   public static int field9103;
   @OriginalMember(
      owner = "client!pb",
      name = "k",
      descriptor = "I"
   )
   public static int field9104;
   @OriginalMember(
      owner = "client!pb",
      name = "h",
      descriptor = "I"
   )
   public int field9105;
   @OriginalMember(
      owner = "client!pb",
      name = "f",
      descriptor = "I"
   )
   public static int field9107;
   @OriginalMember(
      owner = "client!pb",
      name = "d",
      descriptor = "J"
   )
   public static long field9095;

   @OriginalMember(
      owner = "client!pb",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method4602(int arg0) {
      try {
         if (arg0 != 8380) {
            method4603(false, 118);
         }

         ++field9103;
         return ~(1 & this.field9105) != -1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9108[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method4603(boolean arg0, int arg1) {
      try {
         class37.field448 = class510.field7801;
         class12.field156 = 2;
         ++field9107;
         class444.field6812 = arg1;
         class766.method5600(class654.field9782, arg0, (byte)125, "", class654.field9782.equals(""));
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9108[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method4604(int arg0) {
      try {
         ++field9101;
         if (arg0 != -1) {
            field9104 = -27;
         }

         return ~(this.field9105 & 8) != -1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9108[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method4605(int arg0) {
      try {
         ++field9098;
         if (arg0 != 2) {
            field9104 = -105;
         }

         return (2 & this.field9105) != 0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9108[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method4606(byte arg0) {
      try {
         ++field9099;
         int var2 = 48 / ((arg0 - 47) / 60);
         return ~(4 & this.field9105) != -1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9108[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(IIIB)I"
   )
   public static final int method4607(int arg0, int arg1, int arg2, byte arg3) {
      try {
         if (arg3 <= 105) {
            method4608((byte)-35);
         }

         ++field9097;
         if ((class757.field11211[arg1][arg0][arg2] & 8) != 0) {
            return 0;
         } else {
            return ~arg1 < -1 && (class757.field11211[1][arg0][arg2] & 2) != 0 ? arg1 + -1 : arg1;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9108[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4608(byte arg0) {
      try {
         field9106 = null;
         int var1 = -79 / ((50 - arg0) / 33);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9108[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(IZLefa;)V"
   )
   public static final void method4609(int param0, boolean param1, class466 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4610(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4611(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
