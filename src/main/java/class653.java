import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class653 {
   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "I"
   )
   private int field9778;
   @OriginalMember(
      owner = "client!oaa",
      name = "k",
      descriptor = "[Ltha;"
   )
   private class297[] field9771;
   @OriginalMember(
      owner = "client!oaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9781 = new String[]{method4821(method4820("\rB5>\\J")), method4821(method4820("\u0019\rz>e")), method4821(method4820("\fV8|")), method4821(method4820("\rB5>ZJ")), method4821(method4820("\rB5>$\u000bM=d&J")), method4821(method4820("\rB5>[J")), method4821(method4820("\rB5>YJ"))};
   @OriginalMember(
      owner = "client!oaa",
      name = "e",
      descriptor = "Lnaa;"
   )
   public static class113 field9777 = new class113(70, 7);
   @OriginalMember(
      owner = "client!oaa",
      name = "j",
      descriptor = "[C"
   )
   public static char[] field9779 = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
   @OriginalMember(
      owner = "client!oaa",
      name = "c",
      descriptor = "I"
   )
   public static int field9770;
   @OriginalMember(
      owner = "client!oaa",
      name = "d",
      descriptor = "I"
   )
   public static int field9773;
   @OriginalMember(
      owner = "client!oaa",
      name = "i",
      descriptor = "I"
   )
   public static int field9774;
   @OriginalMember(
      owner = "client!oaa",
      name = "h",
      descriptor = "I"
   )
   public static int field9780;
   @OriginalMember(
      owner = "client!oaa",
      name = "b",
      descriptor = "J"
   )
   private long field9776;
   @OriginalMember(
      owner = "client!oaa",
      name = "g",
      descriptor = "Lew;"
   )
   public static class226 field9775;
   @OriginalMember(
      owner = "client!oaa",
      name = "f",
      descriptor = "Ltha;"
   )
   private class297 field9772;

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(I)Ltha;",
      line = 5
   )
   public final class297 method4816(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field9774;
         if (this.field9772 == null) {
            return null;
         } else {
            class297 var3 = this.field9771[(int)(this.field9776 & (long)(this.field9778 - 1))];
            if (arg0 != -1) {
               return null;
            } else {
               while(true) {
                  if (this.field9772 == var3) {
                     this.field9772 = null;
                     if (!var2) {
                        return null;
                     }
                  } else if (this.field9772.field4684 == this.field9776) {
                     class297 var4 = this.field9772;
                     this.field9772 = this.field9772.field4682;
                     return var4;
                  }

                  this.field9772 = this.field9772.field4682;
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9781[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(JB)Ltha;",
      line = 36
   )
   public final class297 method4817(long arg0, byte arg1) {
      boolean var4 = client.field1786;

      try {
         this.field9776 = arg0;
         if (arg1 != -68) {
            this.field9771 = null;
         }

         ++field9773;
         class297 var5 = this.field9771[(int)((long)(this.field9778 + -1) & arg0)];
         this.field9772 = var5.field4682;
         class297 var6;
         if (var4) {
            if (this.field9772.field4684 == arg0) {
               var6 = this.field9772;
               this.field9772 = this.field9772.field4682;
               return var6;
            }

            this.field9772 = this.field9772.field4682;
         }

         while(true) {
            while(this.field9772 != var5) {
               if (this.field9772.field4684 == arg0) {
                  var6 = this.field9772;
                  this.field9772 = this.field9772.field4682;
                  return var6;
               }

               this.field9772 = this.field9772.field4682;
            }

            this.field9772 = null;
            if (!var4) {
               return null;
            }

            this.field9772 = this.field9772.field4682;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9781[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "b",
      descriptor = "(I)V",
      line = 86
   )
   public static void method4818(int arg0) {
      try {
         field9775 = null;
         field9779 = null;
         field9777 = null;
         if (arg0 != 352) {
            method4818(38);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9781[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "<init>",
      descriptor = "(I)V",
      line = 101
   )
   public class653(int arg0) {
      try {
         this.field9778 = arg0;
         this.field9771 = new class297[arg0];

         for(int var2 = 0; ~arg0 < ~var2; ++var2) {
            class297 var3 = this.field9771[var2] = new class297();
            var3.field4679 = var3;
            var3.field4682 = var3;
         }

      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9781[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(IJLtha;)V",
      line = 131
   )
   public final void method4819(int arg0, long arg1, class297 arg2) {
      try {
         ++field9770;
         if (arg2.field4679 != null) {
            arg2.method2495(-24134);
         }

         class297 var5 = this.field9771[(int)((long)(this.field9778 - 1) & arg1)];
         arg2.field4679 = var5.field4679;
         arg2.field4682 = var5;
         if (arg0 < 16) {
            field9780 = 60;
         }

         arg2.field4679.field4682 = arg2;
         arg2.field4682.field4679 = arg2;
         arg2.field4684 = arg1;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field9781[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9781[1] : field9781[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4820(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4821(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
