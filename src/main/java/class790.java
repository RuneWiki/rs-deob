import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class790 {
   @OriginalMember(
      owner = "client!cc",
      name = "d",
      descriptor = "I"
   )
   public int field11503;
   @OriginalMember(
      owner = "client!cc",
      name = "k",
      descriptor = "[I"
   )
   public int[] field11513;
   @OriginalMember(
      owner = "client!cc",
      name = "f",
      descriptor = "[I"
   )
   public int[] field11501;
   @OriginalMember(
      owner = "client!cc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11514 = new String[]{method5704(method5703("k+;j\u001d")), method5704(method5703("k+;\u0017\\f!a\u0015\u001d")), method5704(method5703("k+;o\u001d")), method5704(method5703("sf;\u0005H")), method5704(method5703("f=yG")), method5704(method5703("k+;h\u001d")), method5704(method5703("k+;i\u001d"))};
   @OriginalMember(
      owner = "client!cc",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field11510 = new int[]{0, -1, 0, 1};
   @OriginalMember(
      owner = "client!cc",
      name = "l",
      descriptor = "[[Z"
   )
   public static boolean[][] field11502 = new boolean[][]{new boolean[13], {false, false, true, true, true, true, true, false, false, false, false, false, true}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {false, true, true, true, true, true, false, false, false, false, false, false, true}, {false, true, true, true, true, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, false, true, true, true, true, true, true, false, false, true, true, false}, {true, true, true, true, true, true, true, true, true, true, true, true, true}, new boolean[13], {true, true, true, true, true, true, true, true, true, true, true, true, true}};
   @OriginalMember(
      owner = "client!cc",
      name = "c",
      descriptor = "I"
   )
   public static int field11504;
   @OriginalMember(
      owner = "client!cc",
      name = "i",
      descriptor = "I"
   )
   public static int field11505;
   @OriginalMember(
      owner = "client!cc",
      name = "h",
      descriptor = "I"
   )
   public static int field11509;
   @OriginalMember(
      owner = "client!cc",
      name = "e",
      descriptor = "I"
   )
   public static int field11511;
   @OriginalMember(
      owner = "client!cc",
      name = "j",
      descriptor = "I"
   )
   public static int field11512;
   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "Lsa;"
   )
   public static class39 field11506;
   @OriginalMember(
      owner = "client!cc",
      name = "b",
      descriptor = "Lsa;"
   )
   public static class39 field11508;
   @OriginalMember(
      owner = "client!cc",
      name = "g",
      descriptor = "[Leia;"
   )
   public static class186[] field11507;

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(BII)B"
   )
   public static final byte method5699(byte arg0, int arg1, int arg2) {
      try {
         ++field11511;
         if (arg0 != -69) {
            return 5;
         } else if (~arg1 != -10) {
            return 0;
         } else {
            return (byte)(~(arg2 & 1) == -1 ? 1 : 2);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11514[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5700(int arg0) {
      try {
         field11510 = null;
         field11502 = null;
         field11508 = null;
         int var1 = 58 % ((arg0 - -8) / 61);
         field11506 = null;
         field11507 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11514[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(Lcu;B)Lep;"
   )
   public static final class693 method5701(class65 arg0, byte arg1) {
      try {
         ++field11512;
         if (arg1 != 8) {
            field11502 = null;
         }

         class693 var2 = new class693();
         var2.field9996 = arg0.method685(-2);
         var2.field9998 = class164.field2488.method967((byte)74, var2.field9996);
         return var2;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11514[6] + (arg0 != null ? field11514[3] : field11514[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(BZLqaa;)V"
   )
   public static final void method5702(byte arg0, boolean arg1, class119 arg2) {
      try {
         if (arg0 < 38) {
            method5700(92);
         }

         class375.field5484.method5670(256, arg2);
         ++field11505;
         if (arg1) {
            class114.method1115(class327.field4855, class348.field5112, class375.field5484, class306.field4638, 89, arg2);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11514[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11514[3] : field11514[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class790(int arg0) {
      try {
         this.field11503 = arg0;
         this.field11513 = new int[this.field11503];
         this.field11501 = new int[this.field11503];
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11514[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5703(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5704(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
