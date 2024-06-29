import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class694 {
   @OriginalMember(
      owner = "client!rga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10319 = new String[]{method5109(method5108("g!L\u001d\u0013z\u0015YA\u000e{!\u0005")), method5109(method5108("g!L\u001d$=")), method5109(method5108("g!L\u001d%=")), method5109(method5108("g!L\u001d#=")), method5109(method5108("nh\u0003\u001d\u001a")), method5109(method5108("{3A_")), method5109(method5108("g!L\u001d&="))};
   @OriginalMember(
      owner = "client!rga",
      name = "f",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field10316 = new String[100];
   @OriginalMember(
      owner = "client!rga",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field10317 = new int[5];
   @OriginalMember(
      owner = "client!rga",
      name = "d",
      descriptor = "I"
   )
   public static int field10313;
   @OriginalMember(
      owner = "client!rga",
      name = "b",
      descriptor = "I"
   )
   public static int field10314;
   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "I"
   )
   public static int field10315;
   @OriginalMember(
      owner = "client!rga",
      name = "c",
      descriptor = "I"
   )
   public static int field10318;

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(I)V",
      line = 11
   )
   public static void method5104(int arg0) {
      try {
         field10317 = null;
         field10316 = null;
         if (arg0 != 0) {
            method5107(-57, -37, 55, -83, 113, false, -128, 5);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10319[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(III)I",
      line = 22
   )
   public final int method5105(int arg0, int arg1, int arg2) {
      try {
         ++field10315;
         int var4 = ~class316.field4878 < ~arg1 ? class316.field4878 : arg1;
         if (class96.field1353 == this) {
            return 0;
         } else if (class648.field9338 == this) {
            return -arg2 + var4;
         } else if (class626.field9073 == this) {
            return (-arg2 + var4) / 2;
         } else {
            return arg0 < 114 ? -93 : 0;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10319[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 50
   )
   public final String toString() {
      try {
         ++field10318;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10319[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(Lha;IILfq;I)V",
      line = 59
   )
   public static final void method5106(class610 param0, int param1, int param2, class374 param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(IIIIIZII)V",
      line = 378
   )
   public static final void method5107(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
      boolean var8 = client.field1786;

      try {
         ++field10314;
         class455 var9 = null;
         class455 var10 = (class455)class572.field8474.method4972((byte)-84);
         if (var8 || var10 != null) {
            do {
               if (~var10.field6956 == ~arg2 && var10.field6970 == arg0 && ~var10.field6959 == ~arg1 && var10.field6951 == arg6) {
                  var9 = var10;
                  break;
               }

               var10 = (class455)class572.field8474.method4975((byte)122);
            } while(var10 != null);
         }

         while(var8) {
         }

         if (var9 == null) {
            var9 = new class455();
            var9.field6951 = arg6;
            var9.field6970 = arg0;
            var9.field6959 = arg1;
            var9.field6956 = arg2;
            if (arg0 >= 0 && ~arg1 <= -1 && ~class513.field7828 < ~arg0 && ~class475.field7230 < ~arg1) {
               class82.method800(var9, (byte)-94);
            }

            class572.field8474.method4980(var9, 0);
         }

         var9.field6965 = arg4;
         var9.field6952 = arg7;
         var9.field6960 = arg3;
         var9.field6958 = true;
         var9.field6968 = arg5;
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field10319[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5108(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5109(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
