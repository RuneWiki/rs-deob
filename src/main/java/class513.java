import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class513 extends class305 {
   @OriginalMember(
      owner = "client!hca",
      name = "B",
      descriptor = "I"
   )
   private int field7483;
   @OriginalMember(
      owner = "client!hca",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7491 = new String[]{method3885(method3884("q\u001d+\u0010\t1")), method3885(method3884("q\u001d+\u0010\u000e1")), method3885(method3884("q\u001d+\u0010pp\u0010#Jr1")), method3885(method3884("q\u001d+\u0010\u000f1")), method3885(method3884("q\u001d+\u0010\b1")), method3885(method3884("q\u001d+\u0010\r1")), method3885(method3884("q\u001d+\u0010\n1"))};
   @OriginalMember(
      owner = "client!hca",
      name = "x",
      descriptor = "I"
   )
   public static int field7486 = -1;
   @OriginalMember(
      owner = "client!hca",
      name = "A",
      descriptor = "I"
   )
   public static int field7484;
   @OriginalMember(
      owner = "client!hca",
      name = "G",
      descriptor = "I"
   )
   public static int field7488;
   @OriginalMember(
      owner = "client!hca",
      name = "D",
      descriptor = "I"
   )
   public static int field7489;
   @OriginalMember(
      owner = "client!hca",
      name = "E",
      descriptor = "I"
   )
   public static int field7490;
   @OriginalMember(
      owner = "client!hca",
      name = "v",
      descriptor = "Lhw;"
   )
   public static class141 field7480;
   @OriginalMember(
      owner = "client!hca",
      name = "w",
      descriptor = "Lhc;"
   )
   public static class150 field7485;
   @OriginalMember(
      owner = "client!hca",
      name = "z",
      descriptor = "Lan;"
   )
   public static class25 field7481;
   @OriginalMember(
      owner = "client!hca",
      name = "C",
      descriptor = "[Lcfa;"
   )
   public class177[] field7482;
   @OriginalMember(
      owner = "client!hca",
      name = "y",
      descriptor = "[[B"
   )
   private byte[][] field7487;

   @OriginalMember(
      owner = "client!hca",
      name = "c",
      descriptor = "(II)I"
   )
   public static int method3878(int arg0, int arg1) {
      try {
         return arg0 ^ arg1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7491[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "b",
      descriptor = "(II)Z"
   )
   public final boolean method3879(int arg0, int arg1) {
      try {
         if (arg0 != -1) {
            this.field7483 = -43;
         }

         ++field7484;
         return this.field7482[arg1].field2729;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7491[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "c",
      descriptor = "(BI)Z"
   )
   public final boolean method3880(byte arg0, int arg1) {
      try {
         ++field7488;
         return arg0 != 44 ? true : this.field7482[arg1].field2733;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7491[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "a",
      descriptor = "(II)Z"
   )
   public final boolean method3881(int arg0, int arg1) {
      try {
         int var3 = 90 % ((arg0 - -47) / 58);
         ++field7490;
         return this.field7482[arg1].field2727;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7491[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method3882(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hca",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class513(int arg0) {
      try {
         this.field7483 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7491[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3883(byte arg0) {
      try {
         field7481 = null;
         if (arg0 <= -125) {
            field7485 = null;
            field7480 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7491[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3884(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3885(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
