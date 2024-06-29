import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public class class744 {
   @OriginalMember(
      owner = "client!fka",
      name = "b",
      descriptor = "I"
   )
   private int field10838;
   @OriginalMember(
      owner = "client!fka",
      name = "l",
      descriptor = "Lria;"
   )
   private class301 field10839;
   @OriginalMember(
      owner = "client!fka",
      name = "d",
      descriptor = "I"
   )
   public int field10845;
   @OriginalMember(
      owner = "client!fka",
      name = "p",
      descriptor = "I"
   )
   public int field10841;
   @OriginalMember(
      owner = "client!fka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10855 = new String[]{method5394(method5393("wa,\u0013T9")), method5394(method5393("wa,\u0013W9")), method5394(method5393("j$c\u0013k")), method5394(method5393("\u007f\u007f!Q")), method5394(method5393("wa,\u0013*xd$I(9")), method5394(method5393("wa,\u0013U9")), method5394(method5393("wa,\u0013b~Y9O\u007f\u007fme"))};
   @OriginalMember(
      owner = "client!fka",
      name = "s",
      descriptor = "Lfka;"
   )
   public static class744 field10836 = new class744(0, 3, class301.field4121);
   @OriginalMember(
      owner = "client!fka",
      name = "f",
      descriptor = "Lfka;"
   )
   public static class744 field10842 = new class744(1, 3, class301.field4121);
   @OriginalMember(
      owner = "client!fka",
      name = "k",
      descriptor = "Lfka;"
   )
   public static class744 field10846 = new class744(2, 4, class301.field4117);
   @OriginalMember(
      owner = "client!fka",
      name = "g",
      descriptor = "Lfka;"
   )
   public static class744 field10847 = new class744(3, 1, class301.field4121);
   @OriginalMember(
      owner = "client!fka",
      name = "m",
      descriptor = "Lfka;"
   )
   public static class744 field10848 = new class744(4, 2, class301.field4121);
   @OriginalMember(
      owner = "client!fka",
      name = "j",
      descriptor = "Lfka;"
   )
   public static class744 field10849 = new class744(5, 3, class301.field4121);
   @OriginalMember(
      owner = "client!fka",
      name = "o",
      descriptor = "Lfka;"
   )
   public static class744 field10850 = new class744(6, 4, class301.field4121);
   @OriginalMember(
      owner = "client!fka",
      name = "e",
      descriptor = "I"
   )
   public static int field10851 = class456.method3326(16, (byte)125);
   @OriginalMember(
      owner = "client!fka",
      name = "i",
      descriptor = "I"
   )
   public static int field10837;
   @OriginalMember(
      owner = "client!fka",
      name = "r",
      descriptor = "I"
   )
   public static int field10840;
   @OriginalMember(
      owner = "client!fka",
      name = "q",
      descriptor = "I"
   )
   public static int field10843;
   @OriginalMember(
      owner = "client!fka",
      name = "c",
      descriptor = "I"
   )
   public static int field10844;
   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "I"
   )
   public static int field10854;
   @OriginalMember(
      owner = "client!fka",
      name = "n",
      descriptor = "Lci;"
   )
   public static class476 field10853;
   @OriginalMember(
      owner = "client!fka",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field10852;

   @OriginalMember(
      owner = "client!fka",
      name = "b",
      descriptor = "(II)V",
      line = 9
   )
   public static final void method5390(int arg0, int arg1) {
      try {
         class743.field10823 = 1000000000L / (long)arg0;
         if (arg1 == 1) {
            ++field10837;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10855[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "(B)V",
      line = 29
   )
   public static void method5391(byte arg0) {
      try {
         field10836 = null;
         field10842 = null;
         field10853 = null;
         int var1 = 42 % ((arg0 - -32) / 40);
         field10852 = null;
         field10848 = null;
         field10847 = null;
         field10846 = null;
         field10850 = null;
         field10849 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10855[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 46
   )
   public final String toString() {
      try {
         ++field10843;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10855[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "(II)Lfka;",
      line = 54
   )
   public static final class744 method5392(int arg0, int arg1) {
      try {
         ++field10844;
         if (arg1 <= 107) {
            return null;
         } else {
            if (arg0 != 0) {
               if (arg0 == 1) {
                  return field10842;
               }

               if (~arg0 == -3) {
                  return field10846;
               }

               if (arg0 == 3) {
                  return field10847;
               }

               if (~arg0 == -5) {
                  return field10848;
               }

               if (arg0 == 5) {
                  return field10849;
               }

               if (arg0 != 6) {
                  return null;
               }

               if (!client.field4360) {
                  return field10850;
               }
            }

            return field10836;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10855[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "<init>",
      descriptor = "(IILria;)V",
      line = 132
   )
   private class744(int arg0, int arg1, class301 arg2) {
      try {
         this.field10838 = arg1;
         this.field10839 = arg2;
         this.field10845 = arg0;
         this.field10841 = this.field10839.field4112 * this.field10838;
         if (this.field10845 >= 16) {
            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10855[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10855[2] : field10855[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5393(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5394(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 61;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
