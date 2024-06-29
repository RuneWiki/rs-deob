import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class290 extends class438 {
   @OriginalMember(
      owner = "client!gf",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4064 = new String[]{method2254(method2253("j(>%")), method2254(method2253("\u007fs|g\u0005")), method2254(method2253("c;|\u000eP")), method2254(method2253("c;|\u0000P")), method2254(method2253("c;|\u0001P")), method2254(method2253("c;|\u000bP")), method2254(method2253("c;|\u0003P")), method2254(method2253("c;|\fP"))};
   @OriginalMember(
      owner = "client!gf",
      name = "I",
      descriptor = "Lhm;"
   )
   public static class230 field4055 = new class230(7, 0, 1, 1);
   @OriginalMember(
      owner = "client!gf",
      name = "N",
      descriptor = "B"
   )
   public byte field4061;
   @OriginalMember(
      owner = "client!gf",
      name = "C",
      descriptor = "I"
   )
   public int field4054;
   @OriginalMember(
      owner = "client!gf",
      name = "P",
      descriptor = "I"
   )
   public static int field4057;
   @OriginalMember(
      owner = "client!gf",
      name = "G",
      descriptor = "I"
   )
   public static int field4058;
   @OriginalMember(
      owner = "client!gf",
      name = "L",
      descriptor = "I"
   )
   public static int field4059;
   @OriginalMember(
      owner = "client!gf",
      name = "H",
      descriptor = "I"
   )
   public static int field4060;
   @OriginalMember(
      owner = "client!gf",
      name = "M",
      descriptor = "I"
   )
   public static int field4062;
   @OriginalMember(
      owner = "client!gf",
      name = "J",
      descriptor = "I"
   )
   public static int field4063;
   @OriginalMember(
      owner = "client!gf",
      name = "O",
      descriptor = "Luda;"
   )
   public class473 field4056;

   @OriginalMember(
      owner = "client!gf",
      name = "a",
      descriptor = "(I)[B"
   )
   public final byte[] method1091(int arg0) {
      try {
         if (arg0 != 0) {
            field4059 = -58;
         }

         ++field4057;
         if (!super.field6322 && this.field4056.field6907 >= this.field4056.field6889.length - this.field4061) {
            return this.field4056.field6889;
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4064[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "a",
      descriptor = "(BLuda;)Lkf;"
   )
   public static final class264 method2249(byte arg0, class473 arg1) {
      try {
         if (arg0 != -68) {
            return null;
         } else {
            ++field4062;
            int var2 = arg1.method3567(31871);
            return new class264(var2);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4064[4] + arg0 + ',' + (arg1 != null ? field4064[1] : field4064[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "a",
      descriptor = "(Ljava/lang/String;I[BI)I"
   )
   public static final int method2250(String arg0, int arg1, byte[] arg2, int arg3) {
      boolean var4 = client.field4564;

      try {
         ++field4063;
         int var5 = arg1;
         int var6 = arg0.length();
         int var7 = 0;
         int var10000;
         if (arg3 != -4871) {
            field4055 = null;
            if (var4) {
               var10000 = class226.method1886(arg0.charAt(var7), false);
            } else if (~var6 >= ~var7) {
               var10000 = -arg1 + arg1;
               if (!var4) {
                  return var10000;
               }
            } else {
               var10000 = class226.method1886(arg0.charAt(var7), false);
            }
         } else if (~var6 >= ~var7) {
            var10000 = -arg1 + arg1;
            if (!var4) {
               return var10000;
            }
         } else {
            var10000 = class226.method1886(arg0.charAt(var7), false);
         }

         while(true) {
            int var8 = var10000;
            int var9 = ~var6 >= ~(var7 - -1) ? -1 : class226.method1886(arg0.charAt(var7 + 1), false);
            int var10 = var7 + 2 >= var6 ? -1 : class226.method1886(arg0.charAt(var7 + 2), false);
            int var11 = ~(var7 + 3) <= ~var6 ? -1 : class226.method1886(arg0.charAt(var7 + 3), false);
            arg2[arg1++] = (byte)class93.method899(var9 >>> 4, var8 << 2);
            if (var10 != -1) {
               arg2[arg1++] = (byte)class93.method899(class66.method706(var9, 15) << 4, var10 >>> 2);
               if (~var11 != 0) {
                  arg2[arg1++] = (byte)class93.method899(class66.method706(3, var10) << 6, var11);
                  var7 += 4;
                  if (~var6 >= ~var7) {
                     var10000 = -var5 + arg1;
                     if (!var4) {
                        return var10000;
                     }
                  } else {
                     var10000 = class226.method1886(arg0.charAt(var7), false);
                  }
               } else {
                  var10000 = -var5 + arg1;
                  if (!var4) {
                     return var10000;
                  }
               }
            } else {
               var10000 = -var5 + arg1;
               if (!var4) {
                  return var10000;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field4064[2] + (arg0 != null ? field4064[1] : field4064[0]) + ',' + arg1 + ',' + (arg2 != null ? field4064[1] : field4064[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method2251(int arg0, byte arg1) {
      try {
         if (arg1 == 107) {
            ++field4060;
            class196 var2 = (class196)class64.field1178.method1572((long)arg0, -16289);
            if (var2 != null) {
               var2.field2966.method5200(50);
               class645.method4738(110, var2.field2955, var2.field2963);
               var2.method154(arg1 ^ -13);
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4064[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "h",
      descriptor = "(I)I"
   )
   public final int method1089(int arg0) {
      try {
         ++field4058;
         if (this.field4056 == null) {
            return 0;
         } else {
            if (arg0 != 1) {
               this.method1089(113);
            }

            return this.field4056.field6907 * 100 / (this.field4056.field6889.length + -this.field4061);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4064[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2252(byte arg0) {
      try {
         field4055 = null;
         if (arg0 != -52) {
            field4055 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4064[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2253(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2254(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 93;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
