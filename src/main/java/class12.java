import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class12 {
   @OriginalMember(
      owner = "client!gv",
      name = "c",
      descriptor = "I"
   )
   public int field159;
   @OriginalMember(
      owner = "client!gv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field160 = new String[]{method95(method94("Hf\u001b.")), method95(method94("]=Yl\u0015")), method95(method94("AeY~\u0001Hz\u0003|@")), method95(method94("AeY6\u0007ug\u0005+\u0006A;")), method95(method94("AeY\u0000@")), method95(method94("AeY\u0003@"))};
   @OriginalMember(
      owner = "client!gv",
      name = "g",
      descriptor = "Lhka;"
   )
   public static class377 field151 = new class377(7, 3);
   @OriginalMember(
      owner = "client!gv",
      name = "f",
      descriptor = "[Z"
   )
   public static boolean[] field158 = new boolean[100];
   @OriginalMember(
      owner = "client!gv",
      name = "h",
      descriptor = "Lsl;"
   )
   public static class242 field155 = new class242(0);
   @OriginalMember(
      owner = "client!gv",
      name = "d",
      descriptor = "I"
   )
   public static int field153;
   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "I"
   )
   public static int field154;
   @OriginalMember(
      owner = "client!gv",
      name = "b",
      descriptor = "I"
   )
   public static int field156;
   @OriginalMember(
      owner = "client!gv",
      name = "e",
      descriptor = "I"
   )
   public static int field157;
   @OriginalMember(
      owner = "client!gv",
      name = "i",
      descriptor = "[Ljq;"
   )
   public static class672[] field152;

   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "(I)V",
      line = 4
   )
   public static void method92(int arg0) {
      try {
         field151 = null;
         field155 = null;
         if (arg0 != 100) {
            field155 = null;
         }

         field158 = null;
         field152 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field160[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "(IIIIIIB)V",
      line = 19
   )
   public static final void method93(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
      boolean var7 = client.field1786;

      try {
         ++field154;
         if (arg6 != 40) {
            method92(99);
         }

         int var8 = class47.method332(arg5, class84.field1212, 15989, class368.field5724);
         int var9 = class47.method332(arg4, class84.field1212, 15989, class368.field5724);
         int var10 = class47.method332(arg0, class182.field2833, 15989, class443.field6806);
         int var11 = class47.method332(arg2, class182.field2833, arg6 + 15949, class443.field6806);
         int var12 = class47.method332(arg3 + arg5, class84.field1212, arg6 ^ 15965, class368.field5724);
         int var13 = class47.method332(arg4 - arg3, class84.field1212, 15989, class368.field5724);
         int var14 = var8;
         if (var7) {
            class689.method5076(var11, var10, (byte)57, class512.field7820[var8], arg1);
            var14 = var8 + 1;
         }

         while(true) {
            while(var12 > var14) {
               class689.method5076(var11, var10, (byte)57, class512.field7820[var14], arg1);
               ++var14;
            }

            int var15 = var9;
            if (!var7) {
               if (var7) {
                  class689.method5076(var11, var10, (byte)57, class512.field7820[var9], arg1);
                  var15 = var9 - 1;
               }

               while(true) {
                  while(~var13 > ~var15) {
                     class689.method5076(var11, var10, (byte)57, class512.field7820[var15], arg1);
                     --var15;
                  }

                  int var16 = class47.method332(arg0 + arg3, class182.field2833, 15989, class443.field6806);
                  int var17 = class47.method332(-arg3 + arg2, class182.field2833, arg6 + 15949, class443.field6806);
                  int var18 = var12;
                  if (!var7) {
                     if (!var7 && ~var12 < ~var13) {
                        return;
                     }

                     do {
                        int[] var19 = class512.field7820[var18];
                        class689.method5076(var16, var10, (byte)57, var19, arg1);
                        class689.method5076(var11, var17, (byte)57, var19, arg1);
                        ++var18;
                     } while(~var18 >= ~var13);

                     return;
                  }

                  --var15;
               }
            }

            ++var14;
         }
      } catch (RuntimeException var21) {
         throw class482.method3757(var21, field160[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 93
   )
   public final String toString() {
      try {
         ++field153;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field160[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      line = 101
   )
   public class12(String arg0, String arg1, String arg2, int arg3) {
      try {
         this.field159 = arg3;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field160[2] + (arg0 != null ? field160[1] : field160[0]) + ',' + (arg1 != null ? field160[1] : field160[0]) + ',' + (arg2 != null ? field160[1] : field160[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method94(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method95(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
