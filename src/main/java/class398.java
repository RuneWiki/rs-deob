import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public class class398 extends class580 {
   @OriginalMember(
      owner = "client!fha",
      name = "q",
      descriptor = "J"
   )
   private long field6126 = -1L;
   @OriginalMember(
      owner = "client!fha",
      name = "u",
      descriptor = "Ljava/lang/String;"
   )
   private String field6130 = null;
   @OriginalMember(
      owner = "client!fha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6132 = new String[]{method3062(method3061("\u0003[d4")), method3062(method3061("\u0016\u0000&v\u0017")), method3062(method3061("\u000bFiv(E")), method3062(method3061("\u000bFiv)E")), method3062(method3061("\u0000Ke:\u000f\u001fFi+\u0002W")), method3062(method3061("MCm5\b\b\\f9\u0007\b\u0014")), method3062(method3061("\u000bFiv+E"))};
   @OriginalMember(
      owner = "client!fha",
      name = "t",
      descriptor = "B"
   )
   private byte field6128;
   @OriginalMember(
      owner = "client!fha",
      name = "v",
      descriptor = "I"
   )
   public static int field6125;
   @OriginalMember(
      owner = "client!fha",
      name = "r",
      descriptor = "I"
   )
   public static int field6127;
   @OriginalMember(
      owner = "client!fha",
      name = "s",
      descriptor = "I"
   )
   public static int field6129;
   @OriginalMember(
      owner = "client!fha",
      name = "p",
      descriptor = "I"
   )
   private int field6131;

   @OriginalMember(
      owner = "client!fha",
      name = "a",
      descriptor = "(Lki;B)V",
      line = 5
   )
   public final void method513(class736 arg0, byte arg1) {
      try {
         ++field6125;
         if (arg1 == 94) {
            class135 var3 = new class135();
            var3.field1724 = this.field6130;
            var3.field1723 = this.field6131;
            var3.field1722 = this.field6128;
            arg0.method5352(var3, -1);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6132[2] + (arg0 != null ? field6132[1] : field6132[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fha",
      name = "a",
      descriptor = "(I[[BLmr;)V",
      line = 26
   )
   public static final void method3060(int arg0, byte[][] arg1, class153 arg2) {
      int var3 = client.field4530;

      try {
         ++field6129;
         int var4 = class483.field7165.length;
         int var5 = arg0;
         if (var3 != 0 || arg0 < var4) {
            do {
               byte[] var6 = arg1[var5];
               if (var6 != null) {
                  int var7 = (class483.field7166[var5] >> 8) * 64 - class718.field10676;
                  int var8 = (255 & class483.field7166[var5]) * 64 + -class669.field10064;
                  class351.method2741(arg0 + 8);
                  arg2.method1261(var8, var7, class532.field7778, (byte)-125, class786.field11439, var6);
               }

               ++var5;
            } while(var5 < var4);

         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field6132[3] + arg0 + ',' + (arg1 != null ? field6132[1] : field6132[0]) + ',' + (arg2 != null ? field6132[1] : field6132[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fha",
      name = "a",
      descriptor = "(ILjj;)V",
      line = 68
   )
   public final void method514(int arg0, class128 arg1) {
      try {
         if (~arg1.method1104(255) != -256) {
            --arg1.field1590;
            this.field6126 = arg1.method1063(arg0 ^ 105);
         }

         ++field6127;
         this.field6130 = arg1.method1056(arg0 + -20345);
         this.field6131 = arg1.method1038((byte)-94);
         this.field6128 = arg1.method1047((byte)28);
         arg1.method1063(102);
         if (arg0 != 15) {
            this.field6131 = -3;
         }

         if (class449.field6821) {
            System.out.println(field6132[4] + this.field6126 + field6132[5] + this.field6130);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6132[6] + arg0 + ',' + (arg1 != null ? field6132[1] : field6132[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3061(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3062(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
