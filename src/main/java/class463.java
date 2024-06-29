import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class463 extends class318 implements class172 {
   @OriginalMember(
      owner = "client!nn",
      name = "f",
      descriptor = "I"
   )
   private int field7031;
   @OriginalMember(
      owner = "client!nn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7037 = new String[]{method3595(method3594("g>%\b")), method3595(method3594("g%gXng\"=Z/")), method3595(method3594("regJz")), method3595(method3594("g%g /")), method3595(method3594("g%g#/")), method3595(method3594("g%g&/")), method3595(method3594("g%g\"/")), method3595(method3594("g%g,/")), method3595(method3594("g%g'/")), method3595(method3594("g%g%/"))};
   @OriginalMember(
      owner = "client!nn",
      name = "d",
      descriptor = "I"
   )
   public static int field7029;
   @OriginalMember(
      owner = "client!nn",
      name = "c",
      descriptor = "I"
   )
   public static int field7030;
   @OriginalMember(
      owner = "client!nn",
      name = "i",
      descriptor = "I"
   )
   public static int field7032;
   @OriginalMember(
      owner = "client!nn",
      name = "g",
      descriptor = "I"
   )
   public static int field7033;
   @OriginalMember(
      owner = "client!nn",
      name = "j",
      descriptor = "I"
   )
   public static int field7034;
   @OriginalMember(
      owner = "client!nn",
      name = "e",
      descriptor = "I"
   )
   public static int field7036;
   @OriginalMember(
      owner = "client!nn",
      name = "h",
      descriptor = "[Lvl;"
   )
   public static class409[] field7035;

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "([BIII)V"
   )
   public final void method1590(byte[] arg0, int arg1, int arg2, int arg3) {
      try {
         ++field7032;
         if (arg2 != 24668) {
            method3593((byte)106);
         }

         this.method2627(arg0, arg1);
         this.field7031 = arg3;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field7037[3] + (arg0 != null ? field7037[2] : field7037[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1587(int arg0) {
      try {
         ++field7034;
         if (arg0 != 5549) {
            field7035 = null;
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7037[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1589(int arg0) {
      try {
         if (arg0 != 25544) {
            return 41;
         } else {
            ++field7029;
            return this.field7031;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7037[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "c",
      descriptor = "(I)J"
   )
   public final long method1588(int arg0) {
      try {
         if (arg0 != -23130) {
            return -89L;
         } else {
            ++field7033;
            return super.field4900.getAddress();
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7037[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "<init>",
      descriptor = "(Lc;I[BI)V"
   )
   public class463(class652 arg0, int arg1, byte[] arg2, int arg3) {
      super(arg0, arg2, arg3);

      try {
         this.field7031 = arg1;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field7037[1] + (arg0 != null ? field7037[2] : field7037[0]) + ',' + arg1 + ',' + (arg2 != null ? field7037[2] : field7037[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method3591(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field1786;

      try {
         ++field7036;
         int var6 = 0;
         int var7 = arg1;
         int var8 = -arg1;
         int var10 = class47.method332(arg1 + arg4, class182.field2833, 15989, class443.field6806);
         int var11 = class47.method332(-arg1 + arg4, class182.field2833, 15989, class443.field6806);
         class689.method5076(var10, var11, (byte)57, class512.field7820[arg3], arg2);
         int var9;
         int var10000;
         int var10001;
         if (var5) {
            var9 = arg0 + 2;
            var10000 = var8;
            var10001 = var9;
         } else {
            if (arg1 <= var6) {
               return;
            }

            var9 = arg0 + 2;
            var10000 = var8;
            var10001 = var9;
         }

         while(true) {
            while(true) {
               var8 = var10000 + var10001;
               if (var8 > 0) {
                  --var7;
                  var8 -= var7 << 1;
                  int var12 = arg3 - var7;
                  int var13 = arg3 + var7;
                  if (var13 >= class368.field5724 && ~class84.field1212 <= ~var12) {
                     int var14 = class47.method332(arg4 + var6, class182.field2833, 15989, class443.field6806);
                     int var15 = class47.method332(arg4 - var6, class182.field2833, arg0 + 15990, class443.field6806);
                     if (class84.field1212 >= var13) {
                        class689.method5076(var14, var15, (byte)57, class512.field7820[var13], arg2);
                     }

                     if (class368.field5724 <= var12) {
                        class689.method5076(var14, var15, (byte)57, class512.field7820[var12], arg2);
                     }
                  }
               }

               ++var6;
               int var16 = -var6 + arg3;
               int var17 = arg3 + var6;
               if (class368.field5724 > var17) {
                  break;
               }

               var10000 = class84.field1212;
               var10001 = var16;
               if (!var5) {
                  if (var10000 >= var16) {
                     int var18 = class47.method332(arg4 - -var7, class182.field2833, 15989, class443.field6806);
                     int var19 = class47.method332(-var7 + arg4, class182.field2833, arg0 + 15990, class443.field6806);
                     if (~var17 >= ~class84.field1212) {
                        class689.method5076(var18, var19, (byte)57, class512.field7820[var17], arg2);
                     }

                     if (class368.field5724 <= var16) {
                        class689.method5076(var18, var19, (byte)57, class512.field7820[var16], arg2);
                     }
                  }
                  break;
               }
            }

            if (var7 <= var6) {
               return;
            }

            var9 += 2;
            var10000 = var8;
            var10001 = var9;
         }
      } catch (RuntimeException var21) {
         throw class482.method3757(var21, field7037[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(ILha;)V"
   )
   public static final void method3592(int arg0, class610 arg1) {
      boolean var2 = client.field1786;

      try {
         class471.field7172 = new class564[class623.field9053.length];
         ++field7030;
         int var3 = arg0;
         if (var2 || class623.field9053.length > arg0) {
            do {
               int var4 = class623.field9053[var3];
               class697 var5 = class227.method1961((byte)106, var4, class81.field1152);
               class288 var6 = arg1.method598(var5, class776.method5643(class702.field10458, var4), true);
               class471.field7172[var3] = new class564(var6, var5);
               ++var3;
            } while(class623.field9053.length > var3);

         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field7037[5] + arg0 + ',' + (arg1 != null ? field7037[2] : field7037[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3593(byte arg0) {
      try {
         field7035 = null;
         if (arg0 < 24) {
            method3591(-7, 33, 1, -80, -46);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7037[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3594(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3595(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
