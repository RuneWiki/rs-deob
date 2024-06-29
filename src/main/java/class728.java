import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public class class728 {
   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "Loe;"
   )
   public class15 field10622 = new class15();
   @OriginalMember(
      owner = "client!lja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10626 = new String[]{method5270(method5269("I?Fn\"\r")), method5270(method5269("I?Fn$\r")), method5270(method5269("I?Fn&\r")), method5270(method5269("I?Fn'\r")), method5270(method5269("I?Fn \r")), method5270(method5269("I?Fn#\r")), method5270(method5269("^{\tn\u001c")), method5270(method5269("K K,")), method5270(method5269("I?Fn%\r")), method5270(method5269("I?Fn]L;N4_\r"))};
   @OriginalMember(
      owner = "client!lja",
      name = "e",
      descriptor = "Lrca;"
   )
   public static class37 field10615 = new class37();
   @OriginalMember(
      owner = "client!lja",
      name = "b",
      descriptor = "I"
   )
   public static int field10619 = 0;
   @OriginalMember(
      owner = "client!lja",
      name = "c",
      descriptor = "Ljava/util/Hashtable;"
   )
   public static Hashtable field10624 = new Hashtable();
   @OriginalMember(
      owner = "client!lja",
      name = "j",
      descriptor = "I"
   )
   public static int field10614;
   @OriginalMember(
      owner = "client!lja",
      name = "g",
      descriptor = "I"
   )
   public static int field10616;
   @OriginalMember(
      owner = "client!lja",
      name = "d",
      descriptor = "I"
   )
   public static int field10617;
   @OriginalMember(
      owner = "client!lja",
      name = "i",
      descriptor = "I"
   )
   public static int field10618;
   @OriginalMember(
      owner = "client!lja",
      name = "k",
      descriptor = "I"
   )
   public static int field10620;
   @OriginalMember(
      owner = "client!lja",
      name = "h",
      descriptor = "I"
   )
   public static int field10621;
   @OriginalMember(
      owner = "client!lja",
      name = "l",
      descriptor = "I"
   )
   public static int field10623;
   @OriginalMember(
      owner = "client!lja",
      name = "f",
      descriptor = "Loe;"
   )
   private class15 field10625;

   @OriginalMember(
      owner = "client!lja",
      name = "b",
      descriptor = "(Z)Loe;"
   )
   public final class15 method5262(boolean arg0) {
      try {
         ++field10618;
         class15 var2 = this.field10622.field272;
         if (this.field10622 == var2) {
            return null;
         } else {
            var2.method125(13582);
            return !arg0 ? null : var2;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10626[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method5263(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field10623;
         int var3 = arg0;
         class15 var4 = this.field10622.field272;
         if (var2) {
            var3 = arg0 + 1;
            var4 = var4.field272;
         }

         while(true) {
            if (this.field10622 == var4) {
               if (!var2) {
                  return var3;
               }
            } else {
               ++var3;
            }

            var4 = var4.field272;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10626[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5264(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field10614;

         while(true) {
            class15 var3 = this.field10622.field272;
            if (this.field10622 != var3) {
               var3.method125(13582);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            this.field10625 = null;
            break;
         }

         int var4 = 107 % ((arg0 - -80) / 32);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10626[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "d",
      descriptor = "(I)Loe;"
   )
   public final class15 method5265(int arg0) {
      try {
         if (arg0 > -124) {
            this.method5266(true);
         }

         ++field10617;
         class15 var2 = this.field10622.field272;
         if (this.field10622 == var2) {
            this.field10625 = null;
            return null;
         } else {
            this.field10625 = var2.field272;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10626[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "<init>",
      descriptor = "()V"
   )
   public class728() {
      try {
         this.field10622.field274 = this.field10622;
         this.field10622.field272 = this.field10622;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10626[9] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(Z)Loe;"
   )
   public final class15 method5266(boolean arg0) {
      try {
         if (arg0) {
            return null;
         } else {
            ++field10620;
            class15 var2 = this.field10625;
            if (this.field10622 == var2) {
               this.field10625 = null;
               return null;
            } else {
               this.field10625 = var2.field272;
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10626[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "a",
      descriptor = "(BLoe;)V"
   )
   public final void method5267(byte arg0, class15 arg1) {
      try {
         if (arg0 <= 96) {
            method5268(15);
         }

         if (arg1.field274 != null) {
            arg1.method125(13582);
         }

         ++field10616;
         arg1.field272 = this.field10622;
         arg1.field274 = this.field10622.field274;
         arg1.field274.field272 = arg1;
         arg1.field272.field274 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10626[5] + arg0 + ',' + (arg1 != null ? field10626[6] : field10626[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5268(int arg0) {
      try {
         field10624 = null;
         if (arg0 != 0) {
            method5268(-30);
         }

         field10615 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10626[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5269(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5270(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
