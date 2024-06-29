import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class240 {
   @OriginalMember(
      owner = "client!kga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3644 = new String[]{method2048(method2047("\u0011:<L")), method2048(method2047("\u0014(1\u000eWW")), method2048(method2047("\u0004a~\u000en")), method2048(method2047("\u0014(1\u000eQW")), method2048(method2047("\u0014(1\u000eVW")), method2048(method2047("\u0014(1\u000ePW")), method2048(method2047("\u0014(1\u000eRW"))};
   @OriginalMember(
      owner = "client!kga",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field3640 = new int[4096];
   @OriginalMember(
      owner = "client!kga",
      name = "c",
      descriptor = "I"
   )
   public int field3634;
   @OriginalMember(
      owner = "client!kga",
      name = "b",
      descriptor = "I"
   )
   public static int field3635;
   @OriginalMember(
      owner = "client!kga",
      name = "f",
      descriptor = "I"
   )
   public int field3636;
   @OriginalMember(
      owner = "client!kga",
      name = "e",
      descriptor = "I"
   )
   public static int field3637;
   @OriginalMember(
      owner = "client!kga",
      name = "j",
      descriptor = "I"
   )
   public static int field3638;
   @OriginalMember(
      owner = "client!kga",
      name = "i",
      descriptor = "I"
   )
   public static int field3642;
   @OriginalMember(
      owner = "client!kga",
      name = "d",
      descriptor = "I"
   )
   public int field3643;
   @OriginalMember(
      owner = "client!kga",
      name = "h",
      descriptor = "Z"
   )
   public boolean field3639;
   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "Z"
   )
   public boolean field3641;

   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "(ILjava/net/Socket;I)Lv;"
   )
   public static final class410 method2042(int arg0, Socket arg1, int arg2) throws IOException {
      try {
         ++field3642;
         if (arg2 != -1843) {
            field3640 = null;
         }

         return new class171(arg1, arg0);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3644[4] + arg0 + ',' + (arg1 != null ? field3644[2] : field3644[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method2043(int arg0) {
      try {
         ++field3635;
         if (~class354.field5389 > arg0) {
            class354.field5389 = 0;
            class230.field3525 = -1;
            class177.field2774 = -1;
         }

         if (~class60.field757 > ~class354.field5389) {
            class177.field2774 = -1;
            class354.field5389 = class60.field757;
            class230.field3525 = -1;
         }

         if (class546.field8195 < 0) {
            class177.field2774 = -1;
            class546.field8195 = 0;
            class230.field3525 = -1;
         }

         if (class60.field759 < class546.field8195) {
            class177.field2774 = -1;
            class546.field8195 = class60.field759;
            class230.field3525 = -1;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3644[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2044(int arg0) {
      try {
         field3640 = null;
         if (arg0 != -1) {
            field3640 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3644[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "(IIZI)Lrr;"
   )
   public static final class678 method2045(int arg0, int arg1, boolean arg2, int arg3) {
      try {
         ++field3637;
         class11 var4 = null;
         if (class63.field843 != null) {
            var4 = new class11(arg0, class63.field843, class632.field9151[arg0], 1000000);
         }

         class311.field4826[arg0] = class397.field6223.method3715(arg0, (byte)-127, var4, class236.field3603);
         class311.field4826[arg0].method5433(-16);
         return arg3 != -1 ? null : new class678(class311.field4826[arg0], arg2, arg1);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field3644[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "(Ljava/lang/String;ZILjava/lang/String;)V"
   )
   public static final void method2046(String arg0, boolean arg1, int arg2, String arg3) {
      try {
         class37.field448 = class510.field7801;
         ++field3638;
         class444.field6812 = arg2;
         class12.field156 = 2;
         class766.method5600(arg3, arg1, (byte)24, arg0, false);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3644[1] + (arg0 != null ? field3644[2] : field3644[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3644[2] : field3644[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2047(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2048(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
