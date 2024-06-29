import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class782 {
   @OriginalMember(
      owner = "client!vo",
      name = "c",
      descriptor = "J"
   )
   private long field11396 = -1L;
   @OriginalMember(
      owner = "client!vo",
      name = "d",
      descriptor = "Lsb;"
   )
   private class261 field11398 = new class261();
   @OriginalMember(
      owner = "client!vo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11399 = new String[]{method5651(method5650(";\u001av)%")), method5651(method5650("m\u0011=\u0007y,[;\u0007l#=9\u0018ew")), method5651(method5650("\u000e\u00199\u0005N%\u00146\u0005h!1=\u0007y,[9\u001b}!\f\f\u0004N!\u00146(e,\u001b6\u000eae\\bKN?\u0010<\u000ec9\u001c9\u0007~m\u00117Kc\"\u0001x\u0006l9\u00160J-.\u0016v\ba,\u001b\u0010\n~%O")), method5651(method5650("#\u00004\u0007")), method5651(method5650("6[vEp")), method5651(method5650("m\u0000(\u000fl9\u0010\u0016\u001e`w")), method5651(method5650(";\u001av/%")), method5651(method5650(";\u001av*%")), method5651(method5650("\u0018\u001b*\u000en\"\u00126\u0002~(\u0011x(a,\u001b\u001b\u0003l#\u001b=\u0007I(\u0019,\n-9\f(\u000e-$\u001bx\u000fh.\u001a<\u000e%d")), method5651(method5650(";\u001av(%")), method5651(method5650(";\u001avWd#\u001c,U%"))};
   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "I"
   )
   public static int field11392;
   @OriginalMember(
      owner = "client!vo",
      name = "e",
      descriptor = "I"
   )
   public static int field11393;
   @OriginalMember(
      owner = "client!vo",
      name = "h",
      descriptor = "I"
   )
   public static int field11394;
   @OriginalMember(
      owner = "client!vo",
      name = "g",
      descriptor = "I"
   )
   public static int field11395;
   @OriginalMember(
      owner = "client!vo",
      name = "b",
      descriptor = "I"
   )
   public static int field11397;
   @OriginalMember(
      owner = "client!vo",
      name = "f",
      descriptor = "J"
   )
   private long field11391;

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method5646(byte arg0) {
      try {
         if (arg0 != 100) {
            field11394 = 120;
         }

         ++field11395;
         return class752.field10681.method1829(arg0 ^ 155);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11399[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(ILcu;)V"
   )
   private final void method5647(int arg0, class65 arg1) {
      boolean var3 = client.field10022;

      RuntimeException var10000;
      label63: {
         int var4;
         boolean var10001;
         try {
            this.field11391 = arg1.method680(-129);
            ++field11392;
            this.field11396 = arg1.method680(-129);
            var4 = arg1.method665(false);
            if (arg0 != 15) {
               return;
            }
         } catch (RuntimeException var10) {
            var10000 = var10;
            var10001 = false;
            break label63;
         }

         while(true) {
            class128 var5;
            label58: {
               label57: {
                  try {
                     if (var4 != 0) {
                        if (~var4 != -2) {
                           if (~var4 == -5) {
                              var5 = new class114();
                              if (!var3) {
                                 break label58;
                              }
                           }

                           if (~var4 != -4) {
                              if (var4 == 2) {
                                 var5 = new class768();
                                 if (!var3) {
                                    break label58;
                                 }
                              }

                              throw new RuntimeException(field11399[8]);
                           }

                           var5 = new class59();
                           if (!var3) {
                              break label58;
                           }
                        }
                        break label57;
                     }
                  } catch (RuntimeException var9) {
                     var10000 = var9;
                     var10001 = false;
                     break;
                  }

                  if (!var3) {
                     return;
                  }
               }

               try {
                  var5 = new class460();
               } catch (RuntimeException var8) {
                  var10000 = var8;
                  var10001 = false;
                  break;
               }
            }

            try {
               var5.method608(arg1, 4206);
               this.field11398.method2238(var5, 13);
               var4 = arg1.method665(false);
            } catch (RuntimeException var7) {
               var10000 = var7;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var6 = var10000;
      throw class612.method4503(var6, field11399[7] + arg0 + ',' + (arg1 != null ? field11399[4] : field11399[3]) + ')');
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(Lhka;B)V"
   )
   public final void method5648(class360 param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(IIIII)I"
   )
   public static final int method5649(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         int var5 = 14 / ((arg1 - 53) / 55);
         ++field11393;
         int var6 = arg2 & 15;
         int var7 = var6 < 8 ? arg0 : arg3;
         int var8 = var6 >= 4 ? (var6 != 12 && var6 != 14 ? arg4 : arg0) : arg3;
         return (~(1 & var6) != -1 ? -var7 : var7) - -((var6 & 2) != 0 ? -var8 : var8);
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field11399[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "<init>",
      descriptor = "(Lcu;)V"
   )
   public class782(class65 arg0) {
      try {
         this.method5647(15, arg0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11399[10] + (arg0 != null ? field11399[4] : field11399[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5650(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5651(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
