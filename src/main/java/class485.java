import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class485 extends class366 {
   @OriginalMember(
      owner = "client!qha",
      name = "U",
      descriptor = "Lbaa;"
   )
   private class109 field7377;
   @OriginalMember(
      owner = "client!qha",
      name = "Y",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7382 = new String[]{method3775(method3774("\u0012\u000fHBc")), method3775(method3774("\u0007T\n\u0000")), method3775(method3774("\u0018I\u0007B\"\u0000O\u000f\u0018 A")), method3775(method3774("\u0018I\u0007BW(\t")), method3775(method3774("\u0018I\u0007BV(\t")), method3775(method3774("\u0018I\u0007B\\(\t")), method3775(method3774("\u0018I\u0007BY(\t"))};
   @OriginalMember(
      owner = "client!qha",
      name = "V",
      descriptor = "Z"
   )
   public static boolean field7378 = false;
   @OriginalMember(
      owner = "client!qha",
      name = "X",
      descriptor = "I"
   )
   public static int field7374;
   @OriginalMember(
      owner = "client!qha",
      name = "Q",
      descriptor = "I"
   )
   public static int field7375;
   @OriginalMember(
      owner = "client!qha",
      name = "W",
      descriptor = "I"
   )
   public static int field7376;
   @OriginalMember(
      owner = "client!qha",
      name = "T",
      descriptor = "I"
   )
   public static int field7379;
   @OriginalMember(
      owner = "client!qha",
      name = "R",
      descriptor = "I"
   )
   public static int field7380;
   @OriginalMember(
      owner = "client!qha",
      name = "S",
      descriptor = "I"
   )
   public static int field7381;

   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "(Lvg;IZ)V",
      line = 4
   )
   public final void method2388(class82 arg0, int arg1, boolean arg2) {
      try {
         ++field7374;
         if (arg2) {
            this.field7377 = null;
         }

         class790.method5722(arg1, arg0, this.field7377, 50);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7382[5] + (arg0 != null ? field7382[0] : field7382[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "(Lrr;I)V",
      line = 17
   )
   public static final void method3771(class678 arg0, int arg1) {
      try {
         class214.field3254 = 0;
         ++field7376;
         class568.field8408 = arg1;
         class580.field8572 = new class208();
         class592.field8721 = new class587[1024];
         class33.field413 = new class743[class799.field11623[class539.field8133] + 1];
         class683.field10167 = 0;
         class393.field6164 = 0;
         class674.method4965(arg0, (byte)90);
         class595.method4427(arg1 + -1, arg0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7382[3] + (arg0 != null ? field7382[0] : field7382[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "(BI)V",
      line = 39
   )
   public static final void method3772(byte arg0, int arg1) {
      try {
         ++field7379;
         class242.field3674 = arg1;
         if (arg0 >= 40) {
            class719.field10778.method2551(true);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7382[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "(Lrr;Lrr;I[I)V",
      line = 52
   )
   public static final void method3773(class678 arg0, class678 arg1, int arg2, int[] arg3) {
      try {
         class702.field10458 = arg0;
         if (arg3 != null) {
            class623.field9053 = arg3;
         }

         class81.field1152 = arg1;
         if (arg2 != 1) {
            method3772((byte)110, 73);
         }

         ++field7375;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7382[6] + (arg0 != null ? field7382[0] : field7382[1]) + ',' + (arg1 != null ? field7382[0] : field7382[1]) + ',' + arg2 + ',' + (arg3 != null ? field7382[0] : field7382[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "<init>",
      descriptor = "(Lbaa;Z)V",
      line = 67
   )
   public class485(class109 arg0, boolean arg1) {
      super(arg1);

      try {
         this.field7377 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7382[2] + (arg0 != null ? field7382[0] : field7382[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3774(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3775(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
