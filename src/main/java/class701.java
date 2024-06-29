import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class701 {
   @OriginalMember(
      owner = "client!fb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10249 = new String[]{method5113(method5112("l=mu/")), method5113(method5112("l=mv/")), method5113(method5112("l=mw/"))};
   @OriginalMember(
      owner = "client!fb",
      name = "b",
      descriptor = "Llha;"
   )
   public static class649 field10248 = new class649();
   @OriginalMember(
      owner = "client!fb",
      name = "c",
      descriptor = "I"
   )
   public static int field10246;
   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "I"
   )
   public static int field10247;

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method5109(byte arg0) {
      try {
         ++field10246;
         class386.field5698 = -2;
         class241.field3483 = 0;
         class147.field2385 = -2;
         int var1 = 105 / ((79 - arg0) / 37);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10249[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5110(boolean arg0) {
      try {
         if (!arg0) {
            method5109((byte)-115);
         }

         field10248 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10249[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method5111(byte arg0) {
      boolean var1 = client.field4564;

      try {
         ++field10247;
         class322.method2512(16, class665.field9664);
         ++class709.field10304;
         if (class416.field6089 && class258.field3657) {
            int var2 = 0;
            int var3 = 0;
            if (class262.field3734) {
               var2 = class124.method1174((byte)122);
               var3 = class745.method5410(-81);
            }

            int var4 = class315.field4531.method1630(true) - -var2;
            int var5 = var3 + class315.field4531.method1632(-117);
            int var6 = var5 - class566.field8201;
            int var7 = var4 - class412.field6029;
            if (var7 < class514.field7496) {
               var7 = class514.field7496;
            }

            if (class567.field8233 > var6) {
               var6 = class567.field8233;
            }

            if (~(var7 - -class665.field9664.field4308) < ~(class514.field7496 - -class768.field11144.field4308)) {
               var7 = class514.field7496 - (-class768.field11144.field4308 + class665.field9664.field4308);
            }

            if (~(var6 - -class665.field9664.field4226) < ~(class567.field8233 + class768.field11144.field4226)) {
               var6 = class567.field8233 + class768.field11144.field4226 - class665.field9664.field4226;
            }

            if (arg0 != 7) {
               method5110(true);
            }

            int var8 = -class514.field7496 + class768.field11144.field4341 + var7;
            int var9 = -class567.field8233 + var6 - -class768.field11144.field4235;
            if (!class315.field4531.method4679((byte)115)) {
               label117: {
                  if (!class415.field6084) {
                     if ((class293.field4079 == 1 || class519.method3920(1003)) && class103.field1686 > 2) {
                        class190.method1657(class673.field9874 + class566.field8201, class493.field7171 + class412.field6029, false);
                        if (!var1) {
                           break label117;
                        }
                     }

                     if (!class559.method4176(arg0 + -127)) {
                        break label117;
                     }

                     class190.method1657(class566.field8201 - -class673.field9874, class493.field7171 + class412.field6029, false);
                     if (!var1) {
                        break label117;
                     }
                  }

                  class449.method3386((byte)-46);
                  if (class665.field9664.field4376 != null) {
                     class227 var10 = new class227();
                     var10.field3352 = class665.field9664.field4376;
                     var10.field3355 = var8;
                     var10.field3356 = var9;
                     var10.field3357 = class760.field11027;
                     var10.field3360 = class665.field9664;
                     class161.method1463(var10);
                  }

                  if (class760.field11027 != null && client.method2464(class665.field9664) != null) {
                     class713.method5182(2, class665.field9664, class760.field11027);
                  }
               }

               class665.field9664 = null;
            } else {
               if (class709.field10304 > class665.field9664.field4218) {
                  int var11 = -class493.field7171 + var7;
                  int var12 = var6 - class673.field9874;
                  if (~var11 < ~class665.field9664.field4234 || -class665.field9664.field4234 > var11 || ~class665.field9664.field4234 > ~var12 || -class665.field9664.field4234 > var12) {
                     class415.field6084 = true;
                  }
               }

               if (class665.field9664.field4373 != null && class415.field6084) {
                  class227 var13 = new class227();
                  var13.field3355 = var8;
                  var13.field3360 = class665.field9664;
                  var13.field3352 = class665.field9664.field4373;
                  var13.field3356 = var9;
                  class161.method1463(var13);
               }
            }
         } else {
            if (class709.field10304 > 1) {
               class665.field9664 = null;
            }

         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field10249[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5112(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5113(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
