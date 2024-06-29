import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class341 extends class500 {
   @OriginalMember(
      owner = "client!dh",
      name = "s",
      descriptor = "I"
   )
   public int field4878;
   @OriginalMember(
      owner = "client!dh",
      name = "j",
      descriptor = "I"
   )
   public int field4876;
   @OriginalMember(
      owner = "client!dh",
      name = "q",
      descriptor = "I"
   )
   public int field4873;
   @OriginalMember(
      owner = "client!dh",
      name = "l",
      descriptor = "I"
   )
   public int field4875;
   @OriginalMember(
      owner = "client!dh",
      name = "r",
      descriptor = "Z"
   )
   public boolean field4883;
   @OriginalMember(
      owner = "client!dh",
      name = "m",
      descriptor = "I"
   )
   public int field4874;
   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4884 = new String[]{method2705(method2704("!td~\n+u>|K")), method2705(method2704("!td\u0000K")), method2705(method2704("!td\u0003K")), method2705(method2704(">2dl\u001e")), method2705(method2704("!td\u0001K")), method2705(method2704("+i&.")), method2705(method2704("!td\u0006K")), method2705(method2704("!td\u0007K"))};
   @OriginalMember(
      owner = "client!dh",
      name = "t",
      descriptor = "I"
   )
   public static int field4879;
   @OriginalMember(
      owner = "client!dh",
      name = "k",
      descriptor = "I"
   )
   public static int field4880;
   @OriginalMember(
      owner = "client!dh",
      name = "o",
      descriptor = "I"
   )
   public static int field4881;
   @OriginalMember(
      owner = "client!dh",
      name = "n",
      descriptor = "I"
   )
   public static int field4882;
   @OriginalMember(
      owner = "client!dh",
      name = "p",
      descriptor = "Lvea;"
   )
   public static class289 field4877;

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2699(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(ILeb;BI)V"
   )
   public static final void method2700(int arg0, class657 arg1, byte arg2, int arg3) {
      try {
         ++field4882;
         if (arg1 != null) {
            if (arg1.field9207 != null) {
               class589 var4 = new class589();
               var4.field8116 = arg1.field9207;
               var4.field8110 = arg1;
               class16.method121(var4);
            }

            class110.field1389 = arg1.field9345;
            class740.field10780 = arg1.field9280;
            if (arg2 != -59) {
               field4877 = null;
            }

            class221.field2764 = true;
            class111.field1407 = arg3;
            class325.field4354 = arg1.field9311;
            class593.field8208 = arg1.field9220;
            class226.field2837 = arg1.field9285;
            class32.field377 = arg0;
            class383.method2943(false, arg1);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field4884[4] + arg0 + ',' + (arg1 != null ? field4884[3] : field4884[5]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2701(int arg0) {
      try {
         field4877 = null;
         int var1 = -33 / ((11 - arg0) / 56);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4884[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "b",
      descriptor = "(II)I"
   )
   public static final int method2702(int arg0, int arg1) {
      try {
         ++field4880;
         if (arg1 != 6406) {
            if (arg1 != 6409) {
               if (~arg1 == -32842) {
                  return 1;
               } else if (~arg1 != -6411) {
                  if (~arg1 == -6408) {
                     return 3;
                  } else if (~arg1 == -6409) {
                     return 4;
                  } else {
                     int var2 = -48 % ((arg0 - -33) / 54);
                     throw new IllegalArgumentException("");
                  }
               } else {
                  return 2;
               }
            } else {
               return 1;
            }
         } else {
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4884[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method2703(int arg0, int arg1) {
      try {
         class253.field3211 = arg1;
         int var2 = 69 % ((-79 - arg0) / 37);
         ++field4879;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4884[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "<init>",
      descriptor = "(IIIIIZ)V"
   )
   public class341(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         this.field4878 = arg4;
         this.field4876 = arg2;
         this.field4873 = arg1;
         this.field4875 = arg3;
         this.field4883 = arg5;
         this.field4874 = arg0;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4884[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2704(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2705(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
