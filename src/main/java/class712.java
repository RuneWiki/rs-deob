import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class712 {
   @OriginalMember(
      owner = "client!jca",
      name = "f",
      descriptor = "Ldl;"
   )
   public class70 field10622 = new class70();
   @OriginalMember(
      owner = "client!jca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10634 = new String[]{method5166(method5165("])} \u0013\u001f")), method5166(method5165("])} \u0016\u001f")), method5166(method5165("])} \u0015\u001f")), method5166(method5165("])} \u0010\u001f")), method5166(method5165("])} \u0011\u001f")), method5166(method5165("])} n^$uzl\u001f")), method5166(method5165("Ld2 /")), method5166(method5165("])} \u0017\u001f")), method5166(method5165("Y?pb")), method5166(method5165("])} \u0014\u001f"))};
   @OriginalMember(
      owner = "client!jca",
      name = "h",
      descriptor = "Z"
   )
   public static boolean field10628 = false;
   @OriginalMember(
      owner = "client!jca",
      name = "b",
      descriptor = "I"
   )
   public static int field10623;
   @OriginalMember(
      owner = "client!jca",
      name = "a",
      descriptor = "I"
   )
   public static int field10624;
   @OriginalMember(
      owner = "client!jca",
      name = "i",
      descriptor = "I"
   )
   public static int field10626;
   @OriginalMember(
      owner = "client!jca",
      name = "g",
      descriptor = "I"
   )
   public static int field10627;
   @OriginalMember(
      owner = "client!jca",
      name = "l",
      descriptor = "I"
   )
   public static int field10630;
   @OriginalMember(
      owner = "client!jca",
      name = "c",
      descriptor = "I"
   )
   public static int field10632;
   @OriginalMember(
      owner = "client!jca",
      name = "k",
      descriptor = "I"
   )
   public static int field10633;
   @OriginalMember(
      owner = "client!jca",
      name = "d",
      descriptor = "Leaa;"
   )
   public static class526 field10625;
   @OriginalMember(
      owner = "client!jca",
      name = "j",
      descriptor = "Ldk;"
   )
   public static class536 field10629;
   @OriginalMember(
      owner = "client!jca",
      name = "e",
      descriptor = "Ldl;"
   )
   private class70 field10631;

   @OriginalMember(
      owner = "client!jca",
      name = "<init>",
      descriptor = "()V",
      line = 144
   )
   public class712() {
      try {
         this.field10622.field881 = this.field10622;
         this.field10622.field878 = this.field10622;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10634[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!jca",
      name = "d",
      descriptor = "(I)Ldl;",
      line = 12
   )
   public final class70 method5158(int arg0) {
      try {
         if (arg0 != 0) {
            this.method5161(43);
         }

         ++field10624;
         class70 var2 = this.field10622.field881;
         if (this.field10622 == var2) {
            this.field10631 = null;
            return null;
         } else {
            this.field10631 = var2.field881;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10634[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jca",
      name = "b",
      descriptor = "(I)I",
      line = 33
   )
   public final int method5159(int arg0) {
      int var2 = client.field4530;

      try {
         ++field10627;
         int var3 = 0;
         int var4 = 90 % ((arg0 - 79) / 47);
         class70 var5 = this.field10622.field881;
         if (var2 != 0) {
            var5 = var5.field881;
            ++var3;
         }

         while(true) {
            while(this.field10622 != var5) {
               var5 = var5.field881;
               ++var3;
            }

            if (var2 == 0) {
               return var3;
            }

            ++var3;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field10634[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jca",
      name = "a",
      descriptor = "(I)V",
      line = 54
   )
   public static void method5160(int arg0) {
      try {
         field10629 = null;
         field10625 = null;
         if (arg0 <= 44) {
            field10630 = -94;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10634[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jca",
      name = "c",
      descriptor = "(I)Ldl;",
      line = 67
   )
   public final class70 method5161(int arg0) {
      try {
         ++field10626;
         if (arg0 != 0) {
            this.field10631 = null;
         }

         class70 var2 = this.field10622.field881;
         if (this.field10622 == var2) {
            return null;
         } else {
            var2.method699(12);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10634[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jca",
      name = "b",
      descriptor = "(B)V",
      line = 86
   )
   public final void method5162(byte arg0) {
      int var2 = client.field4530;

      try {
         ++field10623;

         while(true) {
            class70 var3 = this.field10622.field881;
            if (this.field10622 != var3) {
               var3.method699(12);
               if (var2 != 0) {
                  break;
               }

               if (var2 == 0) {
                  continue;
               }
            }

            if (arg0 <= 16) {
               this.method5159(-3);
            }

            this.field10631 = null;
            break;
         }

      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10634[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jca",
      name = "a",
      descriptor = "(B)Ldl;",
      line = 111
   )
   public final class70 method5163(byte arg0) {
      try {
         ++field10633;
         if (arg0 <= 96) {
            return null;
         } else {
            class70 var2 = this.field10631;
            if (this.field10622 == var2) {
               this.field10631 = null;
               return null;
            } else {
               this.field10631 = var2.field881;
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10634[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jca",
      name = "a",
      descriptor = "(Ldl;B)V",
      line = 155
   )
   public final void method5164(class70 arg0, byte arg1) {
      try {
         ++field10632;
         if (arg0.field878 != null) {
            arg0.method699(12);
         }

         arg0.field878 = this.field10622.field878;
         arg0.field881 = this.field10622;
         if (arg1 == -105) {
            arg0.field878.field881 = arg0;
            arg0.field881.field878 = arg0;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10634[7] + (arg0 != null ? field10634[6] : field10634[8]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5165(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5166(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
