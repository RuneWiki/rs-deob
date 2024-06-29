import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class495 {
   @OriginalMember(
      owner = "client!kda",
      name = "b",
      descriptor = "I"
   )
   public int field6900 = 16777215;
   @OriginalMember(
      owner = "client!kda",
      name = "m",
      descriptor = "I"
   )
   public int field6903 = 8;
   @OriginalMember(
      owner = "client!kda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6915 = new String[]{method3767(method3766("$M\" Ig")), method3767(method3766("!\\/b")), method3767(method3766("4\u0007m v")), method3767(method3766("$M\" Hg")), method3767(method3766("$M\" Jg"))};
   @OriginalMember(
      owner = "client!kda",
      name = "l",
      descriptor = "Laka;"
   )
   public static class418 field6911 = new class418(85, 4);
   @OriginalMember(
      owner = "client!kda",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field6913 = new int[2];
   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "I"
   )
   public static int field6914 = 0;
   @OriginalMember(
      owner = "client!kda",
      name = "i",
      descriptor = "Ldp;"
   )
   public static class499 field6912 = new class499(4, 1);
   @OriginalMember(
      owner = "client!kda",
      name = "g",
      descriptor = "I"
   )
   public int field6901;
   @OriginalMember(
      owner = "client!kda",
      name = "o",
      descriptor = "I"
   )
   public static int field6902;
   @OriginalMember(
      owner = "client!kda",
      name = "h",
      descriptor = "I"
   )
   public int field6904;
   @OriginalMember(
      owner = "client!kda",
      name = "d",
      descriptor = "I"
   )
   public static int field6905;
   @OriginalMember(
      owner = "client!kda",
      name = "j",
      descriptor = "I"
   )
   public static int field6906;
   @OriginalMember(
      owner = "client!kda",
      name = "n",
      descriptor = "I"
   )
   public int field6908;
   @OriginalMember(
      owner = "client!kda",
      name = "k",
      descriptor = "I"
   )
   public int field6909;
   @OriginalMember(
      owner = "client!kda",
      name = "f",
      descriptor = "I"
   )
   public int field6910;
   @OriginalMember(
      owner = "client!kda",
      name = "e",
      descriptor = "Z"
   )
   public boolean field6907;

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3763(byte arg0) {
      try {
         if (arg0 > -11) {
            field6911 = null;
         }

         field6913 = null;
         field6911 = null;
         field6912 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6915[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(Lgea;IZ)V"
   )
   private final void method3764(class66 arg0, int arg1, boolean arg2) {
      boolean var4 = client.field1481;

      try {
         label60: {
            ++field6906;
            if (arg1 != 1) {
               if (arg1 != 2) {
                  if (~arg1 == -4) {
                     this.field6908 = arg0.method652((byte)73);
                     this.field6910 = arg0.method652((byte)71);
                     this.field6901 = arg0.method652((byte)-94);
                     if (!var4) {
                        break label60;
                     }
                  }

                  if (~arg1 == -5) {
                     this.field6909 = arg0.method640(255);
                     if (!var4) {
                        break label60;
                     }
                  }

                  if (~arg1 != -6) {
                     if (arg1 != 6) {
                        break label60;
                     }

                     this.field6900 = arg0.method645((byte)-26);
                     if (!var4) {
                        break label60;
                     }
                  }

                  this.field6904 = arg0.method603(-2);
                  if (!var4) {
                     break label60;
                  }
               }

               this.field6907 = true;
               if (!var4) {
                  break label60;
               }
            }

            this.field6903 = arg0.method603(-2);
         }

         if (!arg2) {
            this.method3764((class66)null, 93, false);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6915[0] + (arg0 != null ? field6915[2] : field6915[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method3765(int arg0, class66 arg1) {
      boolean var3 = client.field1481;

      try {
         if (arg0 > 84) {
            ++field6902;

            do {
               int var4 = arg1.method640(255);
               if (~var4 == -1) {
                  break;
               }

               this.method3764(arg1, var4, true);
            } while(!var3);

         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6915[3] + arg0 + ',' + (arg1 != null ? field6915[2] : field6915[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3766(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3767(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
