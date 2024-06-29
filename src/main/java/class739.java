import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class739 implements class534 {
   @OriginalMember(
      owner = "client!oba",
      name = "f",
      descriptor = "Lpt;"
   )
   public class377 field10549;
   @OriginalMember(
      owner = "client!oba",
      name = "d",
      descriptor = "Lsa;"
   )
   private class39 field10556;
   @OriginalMember(
      owner = "client!oba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10557 = new String[]{method5344(method5343("Z<h\u0018T\u001d")), method5344(method5343("Z<h\u0018Q\u001d")), method5344(method5343("Z<h\u0018*\\0`B(\u001d")), method5344(method5343("Np'\u0018k")), method5344(method5343("[+eZ")), method5344(method5343("Z<h\u0018^\u001d")), method5344(method5343("Z<h\u0018W\u001d")), method5344(method5343("Z<h\u0018_\u001d"))};
   @OriginalMember(
      owner = "client!oba",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field10551 = new int[200];
   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "Lfm;"
   )
   public static class164 field10554 = new class164(86, 3);
   @OriginalMember(
      owner = "client!oba",
      name = "i",
      descriptor = "I"
   )
   public static int field10548;
   @OriginalMember(
      owner = "client!oba",
      name = "b",
      descriptor = "I"
   )
   public static int field10550;
   @OriginalMember(
      owner = "client!oba",
      name = "j",
      descriptor = "I"
   )
   public static int field10552;
   @OriginalMember(
      owner = "client!oba",
      name = "h",
      descriptor = "I"
   )
   public static int field10553;
   @OriginalMember(
      owner = "client!oba",
      name = "e",
      descriptor = "Lma;"
   )
   public class148 field10555;
   @OriginalMember(
      owner = "client!oba",
      name = "g",
      descriptor = "Lsa;"
   )
   public static class39 field10547;

   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "(DI)V"
   )
   public static final void method5341(double arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg1 == 200) {
            ++field10550;
            if (class801.field11656 != arg0) {
               int var4 = 0;
               int var5;
               if (var3) {
                  var5 = (int)(255.0D * Math.pow((double)var4 / 255.0D, arg0));
                  class57.field814[var4] = ~var5 < -256 ? 255 : var5;
                  ++var4;
               }

               while(true) {
                  double var10000;
                  if (var4 >= 256) {
                     var10000 = arg0;
                     if (!var3) {
                        class801.field11656 = arg0;
                        return;
                     }
                  } else {
                     var10000 = 255.0D * Math.pow((double)var4 / 255.0D, arg0);
                  }

                  var5 = (int)var10000;
                  class57.field814[var4] = ~var5 < -256 ? 255 : var5;
                  ++var4;
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field10557[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5342(boolean arg0) {
      try {
         field10547 = null;
         if (!arg0) {
            method5341(-0.9676832693556543D, -35);
         }

         field10554 = null;
         field10551 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10557[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "(ZI)V"
   )
   public void method983(boolean arg0, int arg1) {
      try {
         if (arg1 > -55) {
            this.method983(false, -99);
         }

         if (arg0) {
            int var3 = this.field10549.field5512.method4636(class111.field1737, (byte)-72, this.field10555.method1351()) - -this.field10549.field5511;
            int var4 = this.field10549.field5508.method5290(this.field10555.method1356(), class595.field8386, 127) + this.field10549.field5513;
            this.field10555.method1451(var3, var4);
         }

         ++field10548;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10557[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method984(int arg0) {
      try {
         if (arg0 <= 67) {
            this.method983(false, -17);
         }

         ++field10553;
         return this.field10556.method450(0, this.field10549.field5516);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10557[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method988(byte arg0) {
      try {
         ++field10552;
         if (arg0 < 88) {
            field10551 = null;
         }

         this.field10555 = class403.method3147(this.field10556, false, this.field10549.field5516);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10557[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "<init>",
      descriptor = "(Lsa;Lpt;)V"
   )
   public class739(class39 arg0, class377 arg1) {
      try {
         this.field10549 = arg1;
         this.field10556 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10557[2] + (arg0 != null ? field10557[3] : field10557[4]) + ',' + (arg1 != null ? field10557[3] : field10557[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5343(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5344(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
