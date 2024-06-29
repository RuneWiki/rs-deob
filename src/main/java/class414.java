import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class414 {
   @OriginalMember(
      owner = "client!mt",
      name = "b",
      descriptor = "Lfr;"
   )
   public class429 field6061 = new class429();
   @OriginalMember(
      owner = "client!mt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6074 = new String[]{method3168(method3167(">sz7b=n 5#")), method3168(method3167(">szN#")), method3168(method3167(">szI#")), method3168(method3167(">szO#")), method3168(method3167(">szJ#")), method3168(method3167(">szM#")), method3168(method3167("=r8g")), method3168(method3167("()z%v")), method3168(method3167(">szH#"))};
   @OriginalMember(
      owner = "client!mt",
      name = "c",
      descriptor = "Luw;"
   )
   public static class435 field6065 = new class435(79, -1);
   @OriginalMember(
      owner = "client!mt",
      name = "k",
      descriptor = "[S"
   )
   private static short[] field6068 = new short[]{6798, 8741, 25238, 4626, 4550};
   @OriginalMember(
      owner = "client!mt",
      name = "j",
      descriptor = "[S"
   )
   private static short[] field6069 = new short[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!mt",
      name = "m",
      descriptor = "[S"
   )
   private static short[] field6072 = new short[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!mt",
      name = "g",
      descriptor = "[[S"
   )
   public static short[][] field6066 = new short[][]{field6068, field6069, field6072};
   @OriginalMember(
      owner = "client!mt",
      name = "h",
      descriptor = "Lgw;"
   )
   public static class179 field6070 = new class179(4);
   @OriginalMember(
      owner = "client!mt",
      name = "d",
      descriptor = "I"
   )
   public static int field6060;
   @OriginalMember(
      owner = "client!mt",
      name = "l",
      descriptor = "I"
   )
   public static int field6062;
   @OriginalMember(
      owner = "client!mt",
      name = "f",
      descriptor = "I"
   )
   public static int field6064;
   @OriginalMember(
      owner = "client!mt",
      name = "e",
      descriptor = "I"
   )
   public static int field6067;
   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "I"
   )
   public static int field6071;
   @OriginalMember(
      owner = "client!mt",
      name = "n",
      descriptor = "I"
   )
   public static int field6073;
   @OriginalMember(
      owner = "client!mt",
      name = "i",
      descriptor = "Lfr;"
   )
   private class429 field6063;

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3161(byte arg0) {
      try {
         field6070 = null;
         field6068 = null;
         field6072 = null;
         if (arg0 == -89) {
            field6069 = null;
            field6065 = null;
            field6066 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6074[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method3162(int arg0) {
      boolean var2 = client.field4564;

      try {
         if (arg0 != 4550) {
            return -58;
         } else {
            ++field6071;
            int var3 = 0;
            class429 var4 = this.field6061.field6197;
            if (var2) {
               var4 = var4.field6197;
               ++var3;
            }

            while(true) {
               while(this.field6061 != var4) {
                  var4 = var4.field6197;
                  ++var3;
               }

               if (!var2) {
                  return var3;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6074[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "<init>",
      descriptor = "()V"
   )
   public class414() {
      try {
         this.field6061.field6196 = this.field6061;
         this.field6061.field6197 = this.field6061;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6074[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method3163(byte arg0) {
      boolean var2 = client.field4564;

      try {
         if (arg0 == 81) {
            while(true) {
               class429 var3 = this.field6061.field6197;
               if (this.field6061 != var3) {
                  var3.method3241(2);
                  if (var2) {
                     break;
                  }

                  if (!var2) {
                     continue;
                  }
               }

               ++field6062;
               this.field6063 = null;
               break;
            }

         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6074[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(I)Lfr;"
   )
   public final class429 method3164(int arg0) {
      try {
         if (arg0 > -121) {
            return null;
         } else {
            ++field6060;
            class429 var2 = this.field6061.field6197;
            if (this.field6061 == var2) {
               this.field6063 = null;
               return null;
            } else {
               this.field6063 = var2.field6197;
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6074[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(Lfr;I)V"
   )
   public final void method3165(class429 arg0, int arg1) {
      try {
         if (arg0.field6196 != null) {
            arg0.method3241(2);
         }

         ++field6064;
         arg0.field6196 = this.field6061.field6196;
         if (arg1 != -1) {
            field6066 = null;
         }

         arg0.field6197 = this.field6061;
         arg0.field6196.field6197 = arg0;
         arg0.field6197.field6196 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6074[8] + (arg0 != null ? field6074[7] : field6074[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "b",
      descriptor = "(B)Lfr;"
   )
   public final class429 method3166(byte arg0) {
      try {
         ++field6067;
         class429 var2 = this.field6063;
         if (this.field6061 == var2) {
            this.field6063 = null;
            return null;
         } else {
            this.field6063 = var2.field6197;
            if (arg0 > -1) {
               this.field6061 = null;
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6074[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3167(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3168(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
