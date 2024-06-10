import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!g")
public class class16 {
   @OriginalMember(
      owner = "loginapplet!g",
      name = "a",
      descriptor = "Lg;"
   )
   public class16 field121;
   @OriginalMember(
      owner = "loginapplet!g",
      name = "b",
      descriptor = "Lsa;"
   )
   public static class41 field122 = class8.method31(-95, "font");
   @OriginalMember(
      owner = "loginapplet!g",
      name = "c",
      descriptor = "Lg;"
   )
   public class16 field123;
   @OriginalMember(
      owner = "loginapplet!g",
      name = "d",
      descriptor = "F"
   )
   public static float field124;
   @OriginalMember(
      owner = "loginapplet!g",
      name = "e",
      descriptor = "Lsa;"
   )
   public static class41 field125 = class8.method31(97, "box_bottom");
   @OriginalMember(
      owner = "loginapplet!g",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field126;
   @OriginalMember(
      owner = "loginapplet!g",
      name = "g",
      descriptor = "J"
   )
   public long field127;

   @OriginalMember(
      owner = "loginapplet!g",
      name = "a",
      descriptor = "(B)V",
      line = 15
   )
   public static void method82(byte arg0) {
      try {
         field126 = null;
         field125 = null;
         field122 = null;
         if (arg0 != 68) {
            field122 = (class41)null;
         }

      } catch (RuntimeException var2) {
         throw class28.method139(var2, "g.T(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!g",
      name = "a",
      descriptor = "(I)V",
      line = 31
   )
   public final void method83(int arg0) {
      try {
         if (this.field123 != null) {
            this.field123.field121 = this.field121;
            this.field121.field123 = this.field123;
            if (arg0 != 3) {
               this.method83(47);
            }

            this.field123 = null;
            this.field121 = null;
         }
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "g.V(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!g",
      name = "a",
      descriptor = "(Lea;I)Ljava/lang/String;",
      line = 61
   )
   public static final String method84(class13 arg0, int arg1) {
      try {
         int var2 = arg0.field105;
         arg0.field105 = 0;
         int var4 = var2;
         int var5 = var2 % arg1;
         if (var5 != 0) {
            var2 += 3 + -var5;
         }

         StringBuffer var3 = new StringBuffer();

         for(int var6 = 0; var6 < var2; var6 += 3) {
            var3.append(class25.field173[(arg0.field102[arg0.field105 + var6] & 252) >> 1857185506]);
            if (var4 < var6 + 3) {
               if (var5 == 1) {
                  var3.append(class25.field173[59 & arg0.field102[var6 + arg0.field105] << -1972978748]);
                  var3.append("==");
               } else if (~var5 == -3) {
                  var3.append(class25.field173[15 & arg0.field102[1 + var6 + arg0.field105] >> 1407932260 | (3 & arg0.field102[arg0.field105 + var6]) << 1389093028]);
                  var3.append(class25.field173[(arg0.field102[var6 + 1 + arg0.field105] & -1073741809) << -1842867198]);
                  var3.append("=");
               }
            } else {
               var3.append(class25.field173[arg0.field102[arg0.field105 + 1 + var6] >> -2058653980 & 15 | (3 & arg0.field102[arg0.field105 + var6]) << -1141936188]);
               var3.append(class25.field173[arg0.field102[var6 + 2 + arg0.field105] >> -40212410 & 3 | arg0.field102[arg0.field105 + 1 + var6] << -1051868126 & 60]);
               var3.append(class25.field173[arg0.field102[2 + var6 - -arg0.field105] & 63]);
            }
         }

         return var3.toString();
      } catch (RuntimeException var7) {
         throw class28.method139(var7, "g.U(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
      }
   }
}
