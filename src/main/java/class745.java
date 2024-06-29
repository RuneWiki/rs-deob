import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public class class745 {
   @OriginalMember(
      owner = "client!fka",
      name = "e",
      descriptor = "[I"
   )
   public int[] field10832;
   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "[I"
   )
   public int[] field10837;
   @OriginalMember(
      owner = "client!fka",
      name = "c",
      descriptor = "[I"
   )
   public int[] field10835;
   @OriginalMember(
      owner = "client!fka",
      name = "b",
      descriptor = "[I"
   )
   public int[] field10838;
   @OriginalMember(
      owner = "client!fka",
      name = "d",
      descriptor = "[S"
   )
   public short[] field10833;
   @OriginalMember(
      owner = "client!fka",
      name = "f",
      descriptor = "[S"
   )
   public short[] field10834;
   @OriginalMember(
      owner = "client!fka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10839 = new String[]{method5388(method5387("\u001al")), method5388(method5387("F0t")), method5388(method5387("H&53Q\\")), method5388(method5387("\u0000'5k\f\u000f\"=1\u000eN")), method5388(method5387("\b98)")), method5388(method5387("\u001dbzkM")), method5388(method5387("\u0000'5krN"))};
   @OriginalMember(
      owner = "client!fka",
      name = "h",
      descriptor = "I"
   )
   public static int field10831;
   @OriginalMember(
      owner = "client!fka",
      name = "g",
      descriptor = "I"
   )
   public static int field10836;

   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "(IILmk;)V"
   )
   public static final void method5385(int arg0, int arg1, class61 arg2) {
      try {
         ++field10831;
         if (~class56.field610 > -51) {
            if (arg1 == 3) {
               if (arg2 != null && arg2.field659 != null && ~arg0 > ~arg2.field659.length && arg2.field659[arg0] != null) {
                  int var3 = arg2.field659[arg0][0];
                  int var4 = var3 >> 8;
                  int var5 = 7 & var3 >> 5;
                  if (~arg2.field659[arg0].length < -2) {
                     int var6 = (int)((double)arg2.field659[arg0].length * Math.random());
                     if (var6 > 0) {
                        var4 = arg2.field659[arg0][var6];
                     }
                  }

                  int var7 = 256;
                  if (arg2.field663 != null && arg2.field674 != null) {
                     var7 = class404.method3068(false, arg2.field674[arg0], arg2.field663[arg0]);
                  }

                  if (!arg2.field664) {
                     class206.method1559(var7, var5, 255, var4, (byte)1, 0);
                  } else {
                     class108.method957(0, var5, var7, 255, (byte)-93, var4, false);
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field10839[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10839[5] : field10839[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "<init>",
      descriptor = "(Lqa;)V"
   )
   public class745(class261 arg0) {
      try {
         this.field10832 = new int[2];
         this.field10837 = new int[3];
         this.field10835 = new int[3];
         this.field10838 = new int[2];
         this.field10837[2] = arg0.field3411;
         this.field10837[1] = arg0.field3375;
         this.field10837[0] = arg0.field3393;
         this.field10835[1] = arg0.field3389;
         this.field10835[2] = arg0.field3400;
         this.field10835[0] = arg0.field3410;
         this.field10832[1] = arg0.field3381;
         this.field10832[0] = arg0.field3372;
         this.field10838[1] = arg0.field3377;
         this.field10838[0] = arg0.field3358;
         if (arg0.field3412 != null) {
            this.field10833 = new short[arg0.field3412.length];
            class714.method5194(arg0.field3412, 0, this.field10833, 0, this.field10833.length);
         }

         if (arg0.field3354 != null) {
            this.field10834 = new short[arg0.field3354.length];
            class714.method5194(arg0.field3354, 0, this.field10834, 0, this.field10834.length);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10839[3] + (arg0 != null ? field10839[5] : field10839[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;"
   )
   public static final String method5386(int arg0, Throwable arg1) throws IOException {
      int var2 = 114 % (-arg0 / 49);
      ++field10836;
      String var3;
      if (!(arg1 instanceof class419)) {
         var3 = "";
      } else {
         class419 var4 = (class419)arg1;
         arg1 = var4.field5885;
         var3 = var4.field5879 + field10839[1];
      }

      StringWriter var5 = new StringWriter();
      PrintWriter var6 = new PrintWriter(var5);
      arg1.printStackTrace(var6);
      var6.close();
      String var7 = var5.toString();
      BufferedReader var8 = new BufferedReader(new StringReader(var7));
      String var9 = var8.readLine();

      while(true) {
         String var10 = var8.readLine();
         if (var10 == null) {
            return var3 + field10839[0] + var9;
         }

         int var11 = var10.indexOf(40);
         int var12 = var10.indexOf(41, var11 + 1);
         String var13;
         if (~var11 != 0) {
            var13 = var10.substring(0, var11);
         } else {
            var13 = var10;
         }

         String var14 = var13.trim();
         String var15 = var14.substring(var14.lastIndexOf(32) + 1);
         String var16 = var15.substring(var15.lastIndexOf(9) - -1);
         String var17 = var3 + var16;
         if (var11 != -1 && var12 != -1) {
            int var18 = var10.indexOf(field10839[2], var11);
            if (var18 >= 0) {
               var17 = var17 + var10.substring(var18 + 5, var12);
            }
         }

         var3 = var17 + ' ';
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5387(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5388(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
