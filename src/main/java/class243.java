import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class243 {
   @OriginalMember(
      owner = "client!dia",
      name = "c",
      descriptor = "I"
   )
   public int field3100 = 2048;
   @OriginalMember(
      owner = "client!dia",
      name = "k",
      descriptor = "I"
   )
   public int field3101 = 0;
   @OriginalMember(
      owner = "client!dia",
      name = "g",
      descriptor = "I"
   )
   public int field3103 = 2048;
   @OriginalMember(
      owner = "client!dia",
      name = "f",
      descriptor = "I"
   )
   public int field3102 = 0;
   @OriginalMember(
      owner = "client!dia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3110 = new String[]{method1809(method1808("\bN^R\u0012D")), method1809(method1808("\u0017\t\u0011R.")), method1809(method1808("\u0002RS\u0010")), method1809(method1808("\bN^R\u0017D")), method1809(method1808("\bN^R\u0010D")), method1809(method1808("\bN^R\u0011D"))};
   @OriginalMember(
      owner = "client!dia",
      name = "e",
      descriptor = "Lsd;"
   )
   public static class101 field3104 = new class101(3, 5);
   @OriginalMember(
      owner = "client!dia",
      name = "h",
      descriptor = "Ljl;"
   )
   public static class283 field3105 = new class283();
   @OriginalMember(
      owner = "client!dia",
      name = "m",
      descriptor = "S"
   )
   public static short field3108 = 205;
   @OriginalMember(
      owner = "client!dia",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field3109 = new int[1];
   @OriginalMember(
      owner = "client!dia",
      name = "j",
      descriptor = "I"
   )
   public static int field3097;
   @OriginalMember(
      owner = "client!dia",
      name = "b",
      descriptor = "I"
   )
   public static int field3098;
   @OriginalMember(
      owner = "client!dia",
      name = "i",
      descriptor = "I"
   )
   public static int field3099;
   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "I"
   )
   public static int field3106;
   @OriginalMember(
      owner = "client!dia",
      name = "d",
      descriptor = "[[[Z"
   )
   public static boolean[][][] field3107;

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(Ljj;IB)V",
      line = 5
   )
   private final void method1804(class128 arg0, int arg1, byte arg2) {
      int var4 = client.field4530;

      try {
         label46: {
            ++field3098;
            if (~arg1 != -2) {
               if (arg1 == 2) {
                  this.field3103 = arg0.method1038((byte)-119);
                  if (var4 == 0) {
                     break label46;
                  }
               }

               if (~arg1 == -4) {
                  this.field3100 = arg0.method1038((byte)-127);
                  if (var4 == 0) {
                     break label46;
                  }
               }

               if (~arg1 != -5) {
                  break label46;
               }

               this.field3101 = arg0.method1066(32767);
               if (var4 == 0) {
                  break label46;
               }
            }

            this.field3102 = arg0.method1104(255);
         }

         if (arg2 != -39) {
            field3106 = -120;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3110[4] + (arg0 != null ? field3110[1] : field3110[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(IIZ)Z",
      line = 37
   )
   public static final boolean method1805(int arg0, int arg1, boolean arg2) {
      try {
         if (!arg2) {
            return true;
         } else {
            ++field3097;
            return (2048 & arg1) != 0;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3110[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(I)V",
      line = 65
   )
   public static void method1806(int arg0) {
      try {
         field3104 = null;
         if (arg0 != -2) {
            method1805(-107, 56, false);
         }

         field3107 = null;
         field3109 = null;
         field3105 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3110[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(Ljj;I)V",
      line = 82
   )
   public final void method1807(class128 arg0, int arg1) {
      int var3 = client.field4530;

      try {
         if (arg1 <= 121) {
            this.field3101 = -3;
         }

         while(true) {
            int var4 = arg0.method1104(255);
            if (~var4 != -1) {
               this.method1804(arg0, var4, (byte)-39);
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            }

            ++field3099;
            break;
         }

      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3110[0] + (arg0 != null ? field3110[1] : field3110[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1808(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1809(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
