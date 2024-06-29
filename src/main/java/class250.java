import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class250 extends class449 {
   @OriginalMember(
      owner = "client!rga",
      name = "y",
      descriptor = "I"
   )
   public int field3585;
   @OriginalMember(
      owner = "client!rga",
      name = "x",
      descriptor = "I"
   )
   public int field3589;
   @OriginalMember(
      owner = "client!rga",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3591 = new String[]{method2031(method2030("]i\r\u0012")), method2031(method2030("A{\u0000PQZr\b\nS\u001b")), method2031(method2030("H2OP\u0010")), method2031(method2030("A{\u0000P/\u001b")), method2031(method2030("A{\u0000P,\u001b")), method2031(method2030("A{\u0000P(\u001b")), method2031(method2030("A{\u0000P.\u001b")), method2031(method2030("A{\u0000P)\u001b"))};
   @OriginalMember(
      owner = "client!rga",
      name = "z",
      descriptor = "F"
   )
   public static float field3582;
   @OriginalMember(
      owner = "client!rga",
      name = "t",
      descriptor = "I"
   )
   public static int field3583;
   @OriginalMember(
      owner = "client!rga",
      name = "u",
      descriptor = "I"
   )
   public static int field3584;
   @OriginalMember(
      owner = "client!rga",
      name = "s",
      descriptor = "I"
   )
   public static int field3586;
   @OriginalMember(
      owner = "client!rga",
      name = "w",
      descriptor = "I"
   )
   public static int field3587;
   @OriginalMember(
      owner = "client!rga",
      name = "r",
      descriptor = "I"
   )
   public static int field3588;
   @OriginalMember(
      owner = "client!rga",
      name = "v",
      descriptor = "I"
   )
   public static int field3590;

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(BII)Z",
      line = 5
   )
   public static final boolean method2026(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 <= 85) {
            return true;
         } else {
            ++field3587;
            return ~(arg2 & 16) != -1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3591[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(II)V",
      line = 21
   )
   public static final void method2027(int arg0, int arg1) {
      try {
         ++field3590;
         if (~class510.field7454.field11141.method55(false) == -1) {
            arg0 = -1;
         }

         if (class20.field328 != arg0) {
            if (arg0 != -1) {
               label32: {
                  class103 var2 = class549.field7930.method1857(arg1 ^ 33, arg0);
                  class94 var3 = var2.method972((byte)24);
                  if (var3 == null) {
                     arg0 = -1;
                     if (!client.field4564) {
                        break label32;
                     }
                  }

                  class412.field6033.method4783(-8760, var3.method908(), var3.method912(), class386.field5692, new Point(var2.field1684, var2.field1683), var3.method915());
                  class20.field328 = arg0;
               }
            }

            if (arg1 != 0) {
               field3583 = 127;
            }

            if (arg0 == -1 && ~class20.field328 != 0) {
               class412.field6033.method4783(-8760, -1, -1, class386.field5692, new Point(), (int[])null);
               class20.field328 = -1;
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3591[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "<init>",
      descriptor = "(Lfk;Lqda;IIIIIIIII)V",
      line = 61
   )
   public class250(class678 arg0, class112 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

      try {
         this.field3585 = arg9;
         this.field3589 = arg10;
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field3591[1] + (arg0 != null ? field3591[2] : field3591[0]) + ',' + (arg1 != null ? field3591[2] : field3591[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(IZI)Z",
      line = 70
   )
   public static final boolean method2028(int arg0, boolean arg1, int arg2) {
      try {
         if (!arg1) {
            return false;
         } else {
            ++field3586;
            return ~(1024 & arg0) != -1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3591[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(ILha;I)Ltd;",
      line = 82
   )
   public static final class476 method2029(int arg0, class65 arg1, int arg2) {
      try {
         if (arg2 != -1) {
            return null;
         } else {
            ++field3584;
            class196 var3 = (class196)class64.field1178.method1572((long)arg0, -16289);
            if (var3 != null) {
               class688 var4 = var3.field2966.method5213(-1);
               var3.field2959 = true;
               if (var4 != null) {
                  return var4.method5008(arg1, (byte)-93);
               }
            }

            return null;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field3591[6] + arg0 + ',' + (arg1 != null ? field3591[2] : field3591[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "a",
      descriptor = "(B)Lqg;",
      line = 110
   )
   public final class485 method672(byte arg0) {
      try {
         ++field3588;
         if (arg0 != 83) {
            field3583 = 60;
         }

         return class604.field8697;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3591[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2030(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2031(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
