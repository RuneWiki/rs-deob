import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class793 {
   @OriginalMember(
      owner = "client!pt",
      name = "g",
      descriptor = "Lsf;"
   )
   private class475 field11579;
   @OriginalMember(
      owner = "client!pt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11582 = new String[]{method5736(method5735("utsx")), method5736(method5735("`/1:\u000b")), method5736(method5735("ku1U^")), method5736(method5735("ku1P^")), method5736(method5735("ku1Q^")), method5736(method5735("ku1V^")), method5736(method5735("ku1(\u001fuhk*^")), method5736(method5735("ku1W^")), method5736(method5735("ku1R^"))};
   @OriginalMember(
      owner = "client!pt",
      name = "f",
      descriptor = "Luk;"
   )
   public static class498 field11580 = new class498(29, 7);
   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "Ljw;"
   )
   public static class779 field11581 = new class779(11, 0, 1, 2);
   @OriginalMember(
      owner = "client!pt",
      name = "h",
      descriptor = "I"
   )
   public static int field11573;
   @OriginalMember(
      owner = "client!pt",
      name = "c",
      descriptor = "I"
   )
   public static int field11574;
   @OriginalMember(
      owner = "client!pt",
      name = "e",
      descriptor = "I"
   )
   public static int field11575;
   @OriginalMember(
      owner = "client!pt",
      name = "i",
      descriptor = "I"
   )
   public static int field11577;
   @OriginalMember(
      owner = "client!pt",
      name = "d",
      descriptor = "I"
   )
   public static int field11578;
   @OriginalMember(
      owner = "client!pt",
      name = "b",
      descriptor = "Ltha;"
   )
   private class297 field11576;

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(I)Ltha;"
   )
   public final class297 method5729(int arg0) {
      try {
         ++field11575;
         if (arg0 != 21614) {
            return null;
         } else {
            class297 var2 = this.field11579.field7220.field4682;
            if (this.field11579.field7220 == var2) {
               this.field11576 = null;
               return null;
            } else {
               this.field11576 = var2.field4682;
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11582[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5730(boolean arg0) {
      try {
         if (arg0) {
            field11581 = null;
         }

         field11580 = null;
         field11581 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11582[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "b",
      descriptor = "(Z)Ltha;"
   )
   public final class297 method5731(boolean arg0) {
      try {
         ++field11577;
         class297 var2 = this.field11576;
         if (!arg0) {
            field11580 = null;
         }

         if (this.field11579.field7220 == var2) {
            this.field11576 = null;
            return null;
         } else {
            this.field11576 = var2.field4682;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11582[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(Ljava/lang/String;B)V"
   )
   public static final void method5732(String arg0, byte arg1) {
      try {
         ++field11573;
         if (arg1 != 17) {
            method5732((String)null, (byte)-97);
         }

         System.exit(1);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11582[2] + (arg0 != null ? field11582[1] : field11582[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(IIBII)V"
   )
   public static final void method5733(int arg0, int arg1, byte arg2, int arg3, int arg4) {
      boolean var5 = client.field1786;

      try {
         int var6 = 0;
         if (!var5 && class169.field2594 <= var6) {
            if (arg2 != 45) {
               method5732((String)null, (byte)-26);
            }

            ++field11574;
            class171.method1580(arg0 - -arg3, arg1 + arg4, -78, arg4, arg0);
         } else {
            do {
               Rectangle var7 = class640.field9275[var6];
               if (arg0 < var7.x - -var7.width && ~(arg0 + arg3) < ~var7.x && ~(var7.y + var7.height) < ~arg4 && var7.y < arg1 + arg4) {
                  class721.field10798[var6] = true;
               }

               ++var6;
            } while(class169.field2594 > var6);

            if (arg2 != 45) {
               method5732((String)null, (byte)-26);
            }

            ++field11574;
            class171.method1580(arg0 - -arg3, arg1 + arg4, -78, arg4, arg0);
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field11582[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method5734(int param0, int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pt",
      name = "<init>",
      descriptor = "()V"
   )
   public class793() {
   }

   @OriginalMember(
      owner = "client!pt",
      name = "<init>",
      descriptor = "(Lsf;)V"
   )
   public class793(class475 arg0) {
      try {
         this.field11579 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11582[6] + (arg0 != null ? field11582[1] : field11582[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5735(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5736(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
