import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class421 extends class337 implements class172 {
   @OriginalMember(
      owner = "client!bd",
      name = "s",
      descriptor = "I"
   )
   private int field6501;
   @OriginalMember(
      owner = "client!bd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6507 = new String[]{method3349(method3348("jML%\u0019")), method3349(method3348("s\u0007LOL")), method3349(method3348("\u007f\u0016\u000eg")), method3349(method3348("s\u0007LHL")), method3349(method3348("s\u0007L7\r\u007f\n\u00165L")), method3349(method3348("s\u0007LML")), method3349(method3348("s\u0007LJL")), method3349(method3348("s\u0007LLL")), method3349(method3348("s\u0007LNL"))};
   @OriginalMember(
      owner = "client!bd",
      name = "r",
      descriptor = "I"
   )
   public static int field6499;
   @OriginalMember(
      owner = "client!bd",
      name = "p",
      descriptor = "I"
   )
   public static int field6500;
   @OriginalMember(
      owner = "client!bd",
      name = "n",
      descriptor = "I"
   )
   public static int field6502;
   @OriginalMember(
      owner = "client!bd",
      name = "o",
      descriptor = "I"
   )
   public static int field6503;
   @OriginalMember(
      owner = "client!bd",
      name = "t",
      descriptor = "I"
   )
   public static int field6504;
   @OriginalMember(
      owner = "client!bd",
      name = "q",
      descriptor = "I"
   )
   public static int field6505;
   @OriginalMember(
      owner = "client!bd",
      name = "m",
      descriptor = "I"
   )
   public static int field6506;

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "([BIII)V"
   )
   public final void method1590(byte[] arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg2 == 24668) {
            ++field6503;
            this.method2748(arg1, arg0, (byte)15);
            this.field6501 = arg3;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6507[1] + (arg0 != null ? field6507[0] : field6507[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "<init>",
      descriptor = "(Lc;I[BIZ)V"
   )
   public class421(class652 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      super(arg0, 34963, arg2, arg3, arg4);

      try {
         this.field6501 = arg1;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6507[4] + (arg0 != null ? field6507[0] : field6507[2]) + ',' + arg1 + ',' + (arg2 != null ? field6507[0] : field6507[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "c",
      descriptor = "(I)J"
   )
   public final long method1588(int arg0) {
      try {
         if (arg0 != -23130) {
            this.field6501 = 14;
         }

         ++field6504;
         return 0L;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6507[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1589(int arg0) {
      try {
         if (arg0 != 25544) {
            return -68;
         } else {
            ++field6500;
            return this.field6501;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6507[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method2746(boolean arg0) {
      try {
         if (arg0) {
            method3347(-106, -69, -72);
         }

         ++field6505;
         super.field5166.method4758((byte)122, this);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6507[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1587(int arg0) {
      try {
         ++field6502;
         if (arg0 != 5549) {
            field6506 = -122;
         }

         return super.field5169;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6507[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "(B)Z"
   )
   public static final boolean method3346(byte arg0) {
      boolean var1 = client.field1786;

      try {
         ++field6499;
         if (arg0 != -116) {
            return true;
         } else {
            boolean var2 = true;
            if (class610.field8877 == null) {
               label66: {
                  if (class316.field4879.method5002(class12.field157, (byte)95)) {
                     class610.field8877 = class776.method5650(class316.field4879, class12.field157);
                     if (!var1) {
                        break label66;
                     }
                  }

                  var2 = false;
               }
            }

            if (class335.field5147 == null) {
               label60: {
                  if (!class316.field4879.method5002(class629.field9104, (byte)115)) {
                     var2 = false;
                     if (!var1) {
                        break label60;
                     }
                  }

                  class335.field5147 = class776.method5650(class316.field4879, class629.field9104);
               }
            }

            if (class609.field8870 == null) {
               label54: {
                  if (class316.field4879.method5002(class127.field1817, (byte)102)) {
                     class609.field8870 = class776.method5650(class316.field4879, class127.field1817);
                     if (!var1) {
                        break label54;
                     }
                  }

                  var2 = false;
               }
            }

            if (class756.field11202 == null) {
               label48: {
                  if (!class27.field324.method5002(class601.field8798, (byte)91)) {
                     var2 = false;
                     if (!var1) {
                        break label48;
                     }
                  }

                  class756.field11202 = class227.method1961((byte)-107, class601.field8798, class27.field324);
               }
            }

            if (class563.field8373 == null) {
               if (!class316.field4879.method5002(class601.field8798, (byte)123)) {
                  var2 = false;
                  if (!var1) {
                     return var2;
                  }
               }

               class563.field8373 = class776.method5643(class316.field4879, class601.field8798);
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6507[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method3347(int arg0, int arg1, int arg2) {
      class190 var3 = class711.field10694[arg0][arg1][arg2];
      if (var3 != null) {
         class592.method4409(var3.field2952);
         if (var3.field2952 != null) {
            var3.field2952 = null;
         }

      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3348(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3349(char[] arg0) {
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
            var10005 = 99;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
