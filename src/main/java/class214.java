import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class class214 {
   @OriginalMember(
      owner = "client!sa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2719 = new String[]{method1622(method1621(")iy\u0017")), method1622(method1621("4};3\u0019")), method1622(method1621("<2;UL")), method1622(method1621("gO/[")), method1622(method1621("4};<\u0019"))};
   @OriginalMember(
      owner = "client!sa",
      name = "c",
      descriptor = "I"
   )
   public static int field2717 = -1;
   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "Lnda;"
   )
   public static class583 field2716 = new class583();
   @OriginalMember(
      owner = "client!sa",
      name = "b",
      descriptor = "I"
   )
   public static int field2714;
   @OriginalMember(
      owner = "client!sa",
      name = "d",
      descriptor = "I"
   )
   public static int field2715;
   @OriginalMember(
      owner = "client!sa",
      name = "e",
      descriptor = "I"
   )
   public static int field2718;

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(IILpia;I)Lbh;",
      line = 5
   )
   public static final class40 method1619(int arg0, int arg1, class102 arg2, int arg3) {
      try {
         ++field2715;
         int var4 = arg3 << 10 | arg2.field1249;
         class40 var5 = (class40)class544.field8074.method5607((byte)68, (long)var4 << 16);
         if (var5 != null) {
            return var5;
         } else {
            if (arg0 != 1) {
               method1619(73, 10, (class102)null, 1);
            }

            byte[] var6 = class306.field4362.method3888((byte)40, class306.field4362.method3874(var4, (byte)-128));
            if (var6 != null) {
               if (~var6.length >= -2) {
                  return null;
               } else {
                  class40 var7;
                  try {
                     var7 = class208.method1585(false, var6);
                  } catch (Exception var20) {
                     throw new RuntimeException(var20.getMessage() + field2719[3] + var4);
                  }

                  var7.field416 = arg2;
                  class544.field8074.method5610(0, (long)var4 << 16, var7);
                  return var7;
               }
            } else {
               int var9 = arg1 + 65536 << 10 | arg2.field1249;
               class40 var10 = (class40)class544.field8074.method5607((byte)78, (long)var9 << 16);
               if (var10 != null) {
                  return var10;
               } else {
                  byte[] var11 = class306.field4362.method3888((byte)40, class306.field4362.method3874(var9, (byte)-128));
                  if (var11 != null) {
                     if (var11.length <= 1) {
                        return null;
                     } else {
                        class40 var12;
                        try {
                           var12 = class208.method1585(false, var11);
                        } catch (Exception var21) {
                           throw new RuntimeException(var21.getMessage() + field2719[3] + var9);
                        }

                        var12.field416 = arg2;
                        class544.field8074.method5610(0, (long)var9 << 16, var12);
                        return var12;
                     }
                  } else {
                     int var14 = arg2.field1249 | 67107840;
                     class40 var15 = (class40)class544.field8074.method5607((byte)105, (long)var14 << 16);
                     if (var15 != null) {
                        return var15;
                     } else {
                        byte[] var16 = class306.field4362.method3888((byte)40, class306.field4362.method3874(var14, (byte)-127));
                        if (var16 != null) {
                           if (var16.length <= 1) {
                              return null;
                           } else {
                              class40 var17;
                              try {
                                 var17 = class208.method1585(false, var16);
                              } catch (Exception var22) {
                                 throw new RuntimeException(var22.getMessage() + field2719[3] + var14);
                              }

                              var17.field416 = arg2;
                              class544.field8074.method5610(arg0 + -1, (long)var14 << 16, var17);
                              return var17;
                           }
                        } else {
                           return null;
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var23) {
         throw class670.method4877(var23, field2719[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2719[2] : field2719[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(I)V",
      line = 89
   )
   public static void method1620(int arg0) {
      try {
         if (arg0 != -1378109744) {
            field2716 = null;
         }

         field2716 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2719[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "([BBII)I"
   )
   public abstract int method809(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException;

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method811(boolean arg0);

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(BI[BI)V"
   )
   public abstract void method810(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException;

   @OriginalMember(
      owner = "client!sa",
      name = "a",
      descriptor = "(IZ)Z"
   )
   public abstract boolean method807(int arg0, boolean arg1) throws IOException;

   @OriginalMember(
      owner = "client!sa",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method812(int arg0);

   @OriginalMember(
      owner = "client!sa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1621(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1622(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
