import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class106 {
   @OriginalMember(
      owner = "client!sga",
      name = "l",
      descriptor = "Lbga;"
   )
   private class398 field1647 = new class398(256);
   @OriginalMember(
      owner = "client!sga",
      name = "d",
      descriptor = "Lbga;"
   )
   private class398 field1657 = new class398(256);
   @OriginalMember(
      owner = "client!sga",
      name = "f",
      descriptor = "Lsa;"
   )
   private class39 field1655;
   @OriginalMember(
      owner = "client!sga",
      name = "e",
      descriptor = "Lsa;"
   )
   private class39 field1649;
   @OriginalMember(
      owner = "client!sga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1658 = new String[]{method1037(method1036("-.\u001a%nv")), method1037(method1036("0<\u0017g")), method1037(method1036("%gU%V")), method1037(method1036("-.\u001a%\u00177'\u0012\u007f\u0015v")), method1037(method1036("-.\u001a%ov")), method1037(method1036("-.\u001a%hv")), method1037(method1036("-.\u001a%jv")), method1037(method1036("-.\u001a%lv")), method1037(method1036("-.\u001a%iv"))};
   @OriginalMember(
      owner = "client!sga",
      name = "h",
      descriptor = "I"
   )
   public static int field1651 = 0;
   @OriginalMember(
      owner = "client!sga",
      name = "k",
      descriptor = "Lsr;"
   )
   public static class78 field1654 = new class78(1);
   @OriginalMember(
      owner = "client!sga",
      name = "j",
      descriptor = "I"
   )
   public static int field1646;
   @OriginalMember(
      owner = "client!sga",
      name = "i",
      descriptor = "I"
   )
   public static int field1648;
   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "I"
   )
   public static int field1650;
   @OriginalMember(
      owner = "client!sga",
      name = "c",
      descriptor = "I"
   )
   public static int field1652;
   @OriginalMember(
      owner = "client!sga",
      name = "g",
      descriptor = "I"
   )
   public static int field1653;
   @OriginalMember(
      owner = "client!sga",
      name = "b",
      descriptor = "I"
   )
   public static int field1656;

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(I[II)Laia;"
   )
   public final class301 method1029(int arg0, int[] arg1, int arg2) {
      try {
         ++field1650;
         if (this.field1655.method454(100) == 1) {
            return this.method1034(arg0, (byte)-101, arg1, 0);
         } else if (this.field1655.method434((byte)-106, arg0) == 1) {
            return this.method1034(0, (byte)-14, arg1, arg0);
         } else {
            if (arg2 >= -21) {
               field1651 = 41;
            }

            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1658[7] + arg0 + ',' + (arg1 != null ? field1658[2] : field1658[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method1030(int arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field10022;

      try {
         label41: {
            if (arg1 > 243) {
               arg0 >>= 4;
               if (!var4) {
                  break label41;
               }
            }

            if (arg1 <= 217) {
               if (arg1 <= 192) {
                  if (~arg1 >= -180) {
                     break label41;
                  }

                  arg0 >>= 1;
                  if (!var4) {
                     break label41;
                  }
               }

               arg0 >>= 2;
               if (!var4) {
                  break label41;
               }
            }

            arg0 >>= 3;
         }

         if (arg3 >= -108) {
            return -126;
         } else {
            ++field1653;
            return ((arg2 & 255) >> 2 << 10) + (arg0 >> 5 << 7) + (arg1 >> 1);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1658[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(I[III)Laia;"
   )
   private final class301 method1031(int arg0, int[] arg1, int arg2, int arg3) {
      try {
         ++field1646;
         int var5 = ((arg0 & 268439551) << 4 | arg0 >>> 12) ^ arg3;
         int var6 = var5 | arg0 << 16;
         long var7 = (long)var6 ^ 4294967296L;
         class301 var9 = (class301)this.field1657.method3101(-1, var7);
         if (var9 != null) {
            return var9;
         } else if (arg1 != null && ~arg1[0] >= -1) {
            return null;
         } else {
            class469 var10 = (class469)this.field1647.method3101(-1, var7);
            if (var10 == null) {
               var10 = class469.method3601(this.field1649, arg0, arg3);
               if (var10 == null) {
                  return null;
               }

               this.field1647.method3098(var7, var10, -1);
            }

            class301 var11 = var10.method3605(arg1);
            if (var11 == null) {
               return null;
            } else {
               if (arg2 <= 59) {
                  this.field1647 = null;
               }

               var10.method2140((byte)49);
               this.field1657.method3098(var7, var11, -1);
               return var11;
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field1658[4] + arg0 + ',' + (arg1 != null ? field1658[2] : field1658[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1032(boolean arg0) {
      try {
         field1654 = null;
         if (!arg0) {
            method1030(41, 79, -4, -88);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1658[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(III)Ljf;"
   )
   public static final class565 method1033(int arg0, int arg1, int arg2) {
      class312 var3 = class324.field4826[arg0][arg1][arg2];
      return var3 == null ? null : var3.field4689;
   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(IB[II)Laia;"
   )
   private final class301 method1034(int arg0, byte arg1, int[] arg2, int arg3) {
      try {
         ++field1648;
         int var5 = arg0 ^ (arg3 >>> 12 | arg3 << 4 & 65520);
         int var6 = var5 | arg3 << 16;
         long var7 = (long)var6;
         class301 var9 = (class301)this.field1657.method3101(-1, var7);
         if (arg1 > -2) {
            field1656 = -44;
         }

         if (var9 != null) {
            return var9;
         } else if (arg2 != null && arg2[0] <= 0) {
            return null;
         } else {
            class120 var10 = class120.method1190(this.field1655, arg3, arg0);
            if (var10 == null) {
               return null;
            } else {
               class301 var11 = var10.method1191();
               this.field1657.method3098(var7, var11, -1);
               if (arg2 != null) {
                  arg2[0] -= var11.field4493.length;
               }

               return var11;
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field1658[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1658[2] : field1658[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "<init>",
      descriptor = "(Lsa;Lsa;)V"
   )
   public class106(class39 arg0, class39 arg1) {
      try {
         this.field1655 = arg0;
         this.field1649 = arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1658[3] + (arg0 != null ? field1658[2] : field1658[1]) + ',' + (arg1 != null ? field1658[2] : field1658[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "(II[I)Laia;"
   )
   public final class301 method1035(int arg0, int arg1, int[] arg2) {
      try {
         ++field1652;
         if (~this.field1649.method454(arg0 ^ 8004) == -2) {
            return this.method1031(0, arg2, 64, arg1);
         } else if (this.field1649.method434((byte)-106, arg1) == 1) {
            return this.method1031(arg1, arg2, 102, 0);
         } else {
            if (arg0 != 7968) {
               this.method1035(39, -45, (int[])null);
            }

            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1658[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1658[2] : field1658[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1036(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1037(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
