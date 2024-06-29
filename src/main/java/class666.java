import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class666 {
   @OriginalMember(
      owner = "client!sca",
      name = "c",
      descriptor = "Lkj;"
   )
   public class25 field9369 = new class25();
   @OriginalMember(
      owner = "client!sca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9378 = new String[]{method4841(method4840("\u0007'Pio\\")), method4841(method4840("\u001a1]+")), method4841(method4840("\u0007'Pij\\")), method4841(method4840("\u000fj\u001fiT")), method4841(method4840("\u0007'Pik\\")), method4841(method4840("\u0007'Pi\u0015\u001d*X3\u0017\\")), method4841(method4840("\u0007'Pih\\")), method4841(method4840("\u0007'Pim\\")), method4841(method4840("\u0007'Pil\\"))};
   @OriginalMember(
      owner = "client!sca",
      name = "j",
      descriptor = "Ldb;"
   )
   public static class685 field9371 = new class685(8, -1);
   @OriginalMember(
      owner = "client!sca",
      name = "i",
      descriptor = "I"
   )
   public static int field9368;
   @OriginalMember(
      owner = "client!sca",
      name = "f",
      descriptor = "I"
   )
   public static int field9370;
   @OriginalMember(
      owner = "client!sca",
      name = "e",
      descriptor = "I"
   )
   public static int field9372;
   @OriginalMember(
      owner = "client!sca",
      name = "h",
      descriptor = "I"
   )
   public static int field9374;
   @OriginalMember(
      owner = "client!sca",
      name = "g",
      descriptor = "I"
   )
   public static int field9375;
   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "Lma;"
   )
   public static class148 field9376;
   @OriginalMember(
      owner = "client!sca",
      name = "d",
      descriptor = "Lda;"
   )
   public static class216 field9377;
   @OriginalMember(
      owner = "client!sca",
      name = "b",
      descriptor = "Lkj;"
   )
   private class25 field9373;

   @OriginalMember(
      owner = "client!sca",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method4834(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field9368;
         if (arg0 > -65) {
            this.method4834(7);
         }

         int var3 = 0;
         class25 var4 = this.field9369.field358;
         if (var2) {
            var4 = var4.field358;
            ++var3;
         }

         while(true) {
            while(this.field9369 != var4) {
               var4 = var4.field358;
               ++var3;
            }

            if (!var2) {
               return var3;
            }

            ++var3;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9378[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "(I)Lkj;"
   )
   public final class25 method4835(int arg0) {
      try {
         ++field9370;
         if (arg0 != 8) {
            this.method4834(73);
         }

         class25 var2 = this.field9373;
         if (this.field9369 == var2) {
            this.field9373 = null;
            return null;
         } else {
            this.field9373 = var2.field358;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9378[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method4836(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field9372;
         if (arg0 != 8) {
            this.method4834(-62);
         }

         while(true) {
            class25 var3 = this.field9369.field358;
            if (this.field9369 != var3) {
               var3.method315(-10441);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            this.field9373 = null;
            break;
         }

      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9378[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "e",
      descriptor = "(I)Lkj;"
   )
   public final class25 method4837(int arg0) {
      try {
         ++field9374;
         class25 var2 = this.field9369.field358;
         if (this.field9369 == var2) {
            this.field9373 = null;
            return null;
         } else {
            this.field9373 = var2.field358;
            int var3 = -30 % ((10 - arg0) / 57);
            return var2;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9378[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "(Lkj;Z)V"
   )
   public final void method4838(class25 arg0, boolean arg1) {
      try {
         if (arg0.field356 != null) {
            arg0.method315(-10441);
         }

         ++field9375;
         arg0.field358 = this.field9369;
         arg0.field356 = this.field9369.field356;
         arg0.field356.field358 = arg0;
         arg0.field358.field356 = arg0;
         if (!arg1) {
            this.method4836(80);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9378[2] + (arg0 != null ? field9378[3] : field9378[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4839(int arg0) {
      try {
         if (arg0 != 0) {
            field9376 = null;
         }

         field9376 = null;
         field9377 = null;
         field9371 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9378[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "<init>",
      descriptor = "()V"
   )
   public class666() {
      try {
         this.field9369.field356 = this.field9369;
         this.field9369.field358 = this.field9369;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9378[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4840(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4841(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
