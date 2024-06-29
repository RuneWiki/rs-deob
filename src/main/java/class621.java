import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class621 {
   @OriginalMember(
      owner = "client!naa",
      name = "a",
      descriptor = "Liw;"
   )
   private class107 field8879 = new class107(64);
   @OriginalMember(
      owner = "client!naa",
      name = "c",
      descriptor = "Lsa;"
   )
   private class39 field8878;
   @OriginalMember(
      owner = "client!naa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8882 = new String[]{method4575(method4574("3!*X\u001eu")), method4575(method4574("&neX!")), method4575(method4574("35'\u001a")), method4575(method4574("3!*X`4.\"\u0002bu")), method4575(method4574("3!*X\u001du"))};
   @OriginalMember(
      owner = "client!naa",
      name = "b",
      descriptor = "I"
   )
   public static int field8880;
   @OriginalMember(
      owner = "client!naa",
      name = "d",
      descriptor = "I"
   )
   public static int field8881;

   @OriginalMember(
      owner = "client!naa",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method4572(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field8881;
         class111 var4 = class796.method5734(arg0, (long)arg2, (byte)-103);
         var4.method1087(0);
         var4.field1739 = arg1;
         var4.field1740 = arg3;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8882[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "a",
      descriptor = "(II)Liv;"
   )
   public final class204 method4573(int arg0, int arg1) {
      try {
         if (arg0 <= 122) {
            method4572(-120, -51, -6, -20);
         }

         ++field8880;
         class107 var3 = this.field8879;
         class204 var4;
         synchronized(this.field8879) {
            var4 = (class204)this.field8879.method1041((long)arg1, 8);
         }

         if (var4 != null) {
            return var4;
         } else {
            class39 var5 = this.field8878;
            byte[] var6;
            synchronized(this.field8878) {
               var6 = this.field8878.method460((byte)-11, arg1, 5);
            }

            class204 var7 = new class204();
            if (var6 != null) {
               var7.method1769(-120, new class65(var6));
            }

            class107 var8 = this.field8879;
            synchronized(this.field8879) {
               this.field8879.method1050(-118, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field8882[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "<init>",
      descriptor = "(Ltb;ILsa;)V"
   )
   public class621(class392 arg0, int arg1, class39 arg2) {
      try {
         this.field8878 = arg2;
         this.field8878.method434((byte)-106, 5);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8882[3] + (arg0 != null ? field8882[1] : field8882[2]) + ',' + arg1 + ',' + (arg2 != null ? field8882[1] : field8882[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4574(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!naa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4575(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
