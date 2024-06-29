import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class424 {
   @OriginalMember(
      owner = "client!pf",
      name = "g",
      descriptor = "Lig;"
   )
   private class686 field6201 = new class686();
   @OriginalMember(
      owner = "client!pf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6204 = new String[]{method3313(method3312("\u001513W\u001c")), method3313(method3312("\u001513U\u001c")), method3313(method3312("\u001ey3<I")), method3313(method3312("\u000b\"q~")), method3313(method3312("\u001513Q\u001c")), method3313(method3312("\u001513[\u001c")), method3313(method3312("\u001513T\u001c")), method3313(method3312("\u001513Z\u001c")), method3313(method3312("\u001513S\u001c")), method3313(method3312("\u001513P\u001c")), method3313(method3312("\u001513.]\u000b>i,\u001c")), method3313(method3312("\u001513V\u001c"))};
   @OriginalMember(
      owner = "client!pf",
      name = "f",
      descriptor = "I"
   )
   public static int field6193;
   @OriginalMember(
      owner = "client!pf",
      name = "d",
      descriptor = "I"
   )
   public static int field6194;
   @OriginalMember(
      owner = "client!pf",
      name = "e",
      descriptor = "I"
   )
   public static int field6195;
   @OriginalMember(
      owner = "client!pf",
      name = "k",
      descriptor = "I"
   )
   public static int field6196;
   @OriginalMember(
      owner = "client!pf",
      name = "j",
      descriptor = "I"
   )
   public static int field6197;
   @OriginalMember(
      owner = "client!pf",
      name = "b",
      descriptor = "I"
   )
   public static int field6198;
   @OriginalMember(
      owner = "client!pf",
      name = "c",
      descriptor = "I"
   )
   public static int field6200;
   @OriginalMember(
      owner = "client!pf",
      name = "i",
      descriptor = "I"
   )
   public static int field6202;
   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "Lig;"
   )
   private class686 field6203;
   @OriginalMember(
      owner = "client!pf",
      name = "h",
      descriptor = "Ljava/awt/Image;"
   )
   public static Image field6199;

   @OriginalMember(
      owner = "client!pf",
      name = "c",
      descriptor = "(B)Lig;"
   )
   public final class686 method3303(byte arg0) {
      try {
         ++field6198;
         class686 var2 = this.field6201.field9903;
         if (this.field6201 == var2) {
            return null;
         } else {
            var2.method4994((byte)-126);
            int var3 = -46 / ((50 - arg0) / 47);
            return var2;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6204[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method3304(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field6196;
         int var3 = arg0;
         class686 var4 = this.field6201.field9903;
         if (var2) {
            var4 = var4.field9903;
            var3 = arg0 + 1;
         }

         while(true) {
            while(this.field6201 != var4) {
               var4 = var4.field9903;
               ++var3;
            }

            if (!var2) {
               return var3;
            }

            ++var3;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6204[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3305(int arg0) {
      try {
         field6199 = null;
         if (arg0 != 22945) {
            field6199 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6204[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method3306(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field6194;

         while(true) {
            class686 var3 = this.field6201.field9903;
            if (this.field6201 != var3) {
               var3.method4994((byte)-116);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            if (arg0 != 0) {
               this.method3310(-95, (class686)null);
            }

            this.field6203 = null;
            break;
         }

      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6204[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "d",
      descriptor = "(I)Lig;"
   )
   public final class686 method3307(int arg0) {
      try {
         ++field6202;
         if (arg0 != 16976) {
            this.method3303((byte)65);
         }

         class686 var2 = this.field6201.field9903;
         if (this.field6201 == var2) {
            this.field6203 = null;
            return null;
         } else {
            this.field6203 = var2.field9903;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6204[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method3308(byte arg0) {
      try {
         ++field6195;
         int var2 = -83 % ((arg0 - 31) / 46);
         return this.field6201.field9903 == this.field6201;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6204[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(Z)Lig;"
   )
   public final class686 method3309(boolean arg0) {
      try {
         ++field6193;
         class686 var2 = this.field6203;
         if (!arg0) {
            this.field6201 = null;
         }

         if (this.field6201 == var2) {
            this.field6203 = null;
            return null;
         } else {
            this.field6203 = var2.field9903;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6204[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(ILig;)V"
   )
   public final void method3310(int arg0, class686 arg1) {
      try {
         ++field6200;
         if (arg1.field9899 != null) {
            arg1.method4994((byte)-98);
         }

         arg1.field9899 = this.field6201.field9899;
         if (arg0 == 0) {
            arg1.field9903 = this.field6201;
            arg1.field9899.field9903 = arg1;
            arg1.field9903.field9899 = arg1;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6204[4] + arg0 + ',' + (arg1 != null ? field6204[2] : field6204[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "b",
      descriptor = "(B)Lig;"
   )
   public final class686 method3311(byte arg0) {
      try {
         ++field6197;
         if (arg0 != -121) {
            return null;
         } else {
            class686 var2 = this.field6201.field9899;
            if (this.field6201 == var2) {
               this.field6203 = null;
               return null;
            } else {
               this.field6203 = var2.field9899;
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6204[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "<init>",
      descriptor = "()V"
   )
   public class424() {
      try {
         this.field6201.field9899 = this.field6201;
         this.field6201.field9903 = this.field6201;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6204[10] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3312(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3313(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
