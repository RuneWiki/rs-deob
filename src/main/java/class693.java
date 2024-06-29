import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class693 {
   @OriginalMember(
      owner = "client!ua",
      name = "f",
      descriptor = "I"
   )
   public int field10409 = 43594;
   @OriginalMember(
      owner = "client!ua",
      name = "k",
      descriptor = "Z"
   )
   private boolean field10412 = true;
   @OriginalMember(
      owner = "client!ua",
      name = "b",
      descriptor = "I"
   )
   public int field10407 = 443;
   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "Z"
   )
   private boolean field10415 = false;
   @OriginalMember(
      owner = "client!ua",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10419 = new String[]{method5039(method5038("=\b8\u007f+")), method5039(method5038("&\u001czP")), method5039(method5038("3G8\u0012~")), method5039(method5038("=\b8}+")), method5039(method5038("?\u001ea\u0011t<\u001e\u007fL")), method5039(method5038("g\b+")), method5039(method5038(" \u001dbL9gF")), method5039(method5038("?\u001ea")), method5039(method5038("f\nyQ,$T")), method5039(method5038("g\u0019+")), method5039(method5038("?\u001ea\u0011t<\u001bu")), method5039(method5038("?\u001ea\u0011t<\u0018w")), method5039(method5038("=\b8y+")), method5039(method5038("=\b8~+")), method5039(method5038("=\b8x+"))};
   @OriginalMember(
      owner = "client!ua",
      name = "g",
      descriptor = "I"
   )
   public static int field10408;
   @OriginalMember(
      owner = "client!ua",
      name = "l",
      descriptor = "I"
   )
   public static int field10411;
   @OriginalMember(
      owner = "client!ua",
      name = "e",
      descriptor = "I"
   )
   public static int field10413;
   @OriginalMember(
      owner = "client!ua",
      name = "d",
      descriptor = "I"
   )
   public int field10414;
   @OriginalMember(
      owner = "client!ua",
      name = "i",
      descriptor = "I"
   )
   public static int field10416;
   @OriginalMember(
      owner = "client!ua",
      name = "h",
      descriptor = "Llw;"
   )
   public static class687 field10418;
   @OriginalMember(
      owner = "client!ua",
      name = "c",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field10417;
   @OriginalMember(
      owner = "client!ua",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   public String field10410;

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(I)Ljava/lang/String;",
      line = 13
   )
   public static final String method5033(int arg0) {
      int var1 = client.field4530;

      try {
         String var2;
         label33: {
            ++field10408;
            var2 = field10419[7];
            if (class487.field7208 != class272.field3785) {
               if (class547.field8115 == class487.field7208) {
                  var2 = field10419[11];
                  if (var1 == 0) {
                     break label33;
                  }
               }

               if (class487.field7208 != class366.field5503) {
                  break label33;
               }

               var2 = field10419[4];
               if (var1 == 0) {
                  break label33;
               }
            }

            var2 = field10419[10];
         }

         String var3 = "";
         if (class37.field401 != null) {
            var3 = field10419[9] + class37.field401;
         }

         if (arg0 != -5751) {
            method5033(47);
         }

         return field10419[6] + var2 + "." + class489.field7224.field254 + field10419[8] + class728.field10827 + field10419[5] + class225.field2894 + var3 + "/";
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10419[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "b",
      descriptor = "(I)V",
      line = 44
   )
   public final void method5034(int arg0) {
      int var2 = client.field4530;

      try {
         label34: {
            if (!this.field10412) {
               this.field10412 = true;
               this.field10415 = true;
               if (var2 == 0) {
                  break label34;
               }
            }

            if (this.field10415) {
               this.field10415 = false;
               if (var2 == 0) {
                  break label34;
               }
            }

            this.field10412 = false;
         }

         if (arg0 != 3455) {
            method5035(false);
         }

         ++field10413;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10419[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(Z)V",
      line = 71
   )
   public static void method5035(boolean arg0) {
      try {
         if (!arg0) {
            method5035(true);
         }

         field10418 = null;
         field10417 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10419[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(Lhg;I)Ldaa;",
      line = 91
   )
   public final class12 method5036(class719 arg0, int arg1) {
      try {
         ++field10411;
         if (arg1 != 443) {
            method5033(23);
         }

         return arg0.method5207(this.field10415, arg1 ^ 443, this.field10412 ? this.field10407 : this.field10409, this.field10410);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10419[14] + (arg0 != null ? field10419[2] : field10419[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(ZLua;)Z",
      line = 110
   )
   public final boolean method5037(boolean arg0, class693 arg1) {
      try {
         ++field10416;
         if (!arg0) {
            method5033(-79);
         }

         if (arg1 == null) {
            return false;
         } else {
            return this.field10414 == arg1.field10414 && this.field10410.equals(arg1.field10410);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10419[0] + arg0 + ',' + (arg1 != null ? field10419[2] : field10419[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5038(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ua",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5039(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
