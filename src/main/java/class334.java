import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class class334 {
   @OriginalMember(
      owner = "client!vc",
      name = "j",
      descriptor = "I"
   )
   private int field4777;
   @OriginalMember(
      owner = "client!vc",
      name = "c",
      descriptor = "I"
   )
   private int field4782;
   @OriginalMember(
      owner = "client!vc",
      name = "g",
      descriptor = "Lck;"
   )
   public class667 field4783;
   @OriginalMember(
      owner = "client!vc",
      name = "a",
      descriptor = "Z"
   )
   private boolean field4778;
   @OriginalMember(
      owner = "client!vc",
      name = "k",
      descriptor = "I"
   )
   public int field4785;
   @OriginalMember(
      owner = "client!vc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4786 = new String[]{method2535(method2534("\t'%'_")), method2535(method2534("\u001c|ge")), method2535(method2534("\u0004j%5K\u001c`\u007f7\n")), method2535(method2534("\u0004j%M\n")), method2535(method2534("\u0015g{fTC")), method2535(method2534("\u0004j%J\n")), method2535(method2534("\u0004j%oK\u001chg`X\u0017!")), method2535(method2534("\u0004j%H\n"))};
   @OriginalMember(
      owner = "client!vc",
      name = "f",
      descriptor = "I"
   )
   public static int field4775 = 0;
   @OriginalMember(
      owner = "client!vc",
      name = "h",
      descriptor = "I"
   )
   public static int field4776;
   @OriginalMember(
      owner = "client!vc",
      name = "b",
      descriptor = "I"
   )
   public static int field4780;
   @OriginalMember(
      owner = "client!vc",
      name = "d",
      descriptor = "I"
   )
   public static int field4781;
   @OriginalMember(
      owner = "client!vc",
      name = "e",
      descriptor = "I"
   )
   public static int field4784;
   @OriginalMember(
      owner = "client!vc",
      name = "i",
      descriptor = "Lkg;"
   )
   public static class284 field4779;

   @OriginalMember(
      owner = "client!vc",
      name = "finalize",
      descriptor = "()V",
      line = 9
   )
   protected final void finalize() throws Throwable {
      try {
         this.field4783.method4809(true, this.field4785, this.field4777);
         ++field4784;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4786[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "b",
      descriptor = "(B)V",
      line = 19
   )
   public static void method2531(byte arg0) {
      try {
         field4779 = null;
         if (arg0 != 98) {
            field4776 = 49;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4786[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "a",
      descriptor = "(I[BI)V",
      line = 31
   )
   public final void method2532(int arg0, byte[] arg1, int arg2) {
      try {
         ++field4781;
         this.method995(-18582);
         if (arg2 != 3) {
            field4779 = null;
         }

         if (this.field4777 < arg0) {
            OpenGL.glBufferDataARBub(this.field4782, arg0, arg1, 0, !this.field4778 ? 35044 : 35040);
            this.field4783.field9917 += -this.field4777 + arg0;
            this.field4777 = arg0;
         } else {
            OpenGL.glBufferSubDataARBub(this.field4782, 0, arg0, arg1, 0);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4786[7] + arg0 + ',' + (arg1 != null ? field4786[0] : field4786[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "b",
      descriptor = "(Z)V",
      line = 59
   )
   public static final void method2533(boolean arg0) {
      int var1 = client.field4530;

      try {
         ++field4780;
         if (arg0) {
            method2531((byte)85);
         }

         class401.field6163.method3835(9);
         int var2 = class401.field6163.method3829(-109, 8);
         if (~var2 > ~class159.field2021) {
            int var3 = var2;
            if (var1 != 0 || ~class159.field2021 < ~var2) {
               do {
                  class556.field8258[class315.field4506++] = class115.field1381[var3];
                  ++var3;
               } while(~class159.field2021 < ~var3);
            }
         }

         if (~var2 < ~class159.field2021) {
            throw new RuntimeException(field4786[4]);
         } else {
            class159.field2021 = 0;
            int var4 = 0;
            if (var1 != 0 || var4 < var2) {
               do {
                  label99: {
                     int var5 = class115.field1381[var4];
                     class155 var6 = ((class726)class259.field3509.method5681((long)var5, -1)).field10794;
                     int var7 = class401.field6163.method3829(-53, 1);
                     if (~var7 == -1) {
                        class115.field1381[class159.field2021++] = var5;
                        var6.field6088 = class109.field1338;
                        if (var1 == 0) {
                           break label99;
                        }
                     }

                     int var8 = class401.field6163.method3829(-123, 2);
                     if (~var8 == -1) {
                        class115.field1381[class159.field2021++] = var5;
                        var6.field6088 = class109.field1338;
                        class96.field1189[class144.field1823++] = var5;
                        if (var1 == 0) {
                           break label99;
                        }
                     }

                     if (var8 == 1) {
                        class115.field1381[class159.field2021++] = var5;
                        var6.field6088 = class109.field1338;
                        int var9 = class401.field6163.method3829(-79, 3);
                        var6.method1281(1, var9, -1);
                        int var10 = class401.field6163.method3829(-102, 1);
                        if (var10 != 1) {
                           break label99;
                        }

                        class96.field1189[class144.field1823++] = var5;
                        if (var1 == 0) {
                           break label99;
                        }
                     }

                     if (var8 == 2) {
                        label71: {
                           class115.field1381[class159.field2021++] = var5;
                           var6.field6088 = class109.field1338;
                           if (~class401.field6163.method3829(-120, 1) != -2) {
                              int var11 = class401.field6163.method3829(-100, 3);
                              var6.method1281(0, var11, -1);
                              if (var1 == 0) {
                                 break label71;
                              }
                           }

                           int var12 = class401.field6163.method3829(-58, 3);
                           var6.method1281(2, var12, -1);
                           int var13 = class401.field6163.method3829(-111, 3);
                           var6.method1281(2, var13, -1);
                        }

                        int var14 = class401.field6163.method3829(-74, 1);
                        if (~var14 != -2) {
                           break label99;
                        }

                        class96.field1189[class144.field1823++] = var5;
                        if (var1 == 0) {
                           break label99;
                        }
                     }

                     if (var8 == 3) {
                        class556.field8258[class315.field4506++] = var5;
                     }
                  }

                  ++var4;
               } while(var4 < var2);

            }
         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field4786[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "<init>",
      descriptor = "(Lck;I[BIZ)V",
      line = 174
   )
   public class334(class667 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      try {
         this.field4777 = arg3;
         this.field4782 = arg1;
         this.field4783 = arg0;
         this.field4778 = arg4;
         OpenGL.glGenBuffersARB(1, class743.field11017, 0);
         this.field4785 = class743.field11017[0];
         this.method995(-18582);
         OpenGL.glBufferDataARBub(arg1, this.field4777, arg2, 0, this.field4778 ? 35040 : 35044);
         this.field4783.field9917 += this.field4777;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field4786[2] + (arg0 != null ? field4786[0] : field4786[1]) + ',' + arg1 + ',' + (arg2 != null ? field4786[0] : field4786[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "<init>",
      descriptor = "(Lck;ILjaclib/memory/Buffer;IZ)V",
      line = 193
   )
   public class334(class667 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
      try {
         this.field4783 = arg0;
         this.field4778 = arg4;
         this.field4777 = arg3;
         this.field4782 = arg1;
         OpenGL.glGenBuffersARB(1, class743.field11017, 0);
         this.field4785 = class743.field11017[0];
         this.method995(-18582);
         OpenGL.glBufferDataARBa(arg1, this.field4777, arg2.getAddress(), !this.field4778 ? 35044 : 35040);
         this.field4783.field9917 += this.field4777;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field4786[2] + (arg0 != null ? field4786[0] : field4786[1]) + ',' + arg1 + ',' + (arg2 != null ? field4786[0] : field4786[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "d",
      descriptor = "(I)V"
   )
   public abstract void method995(int arg0);

   @OriginalMember(
      owner = "client!vc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2534(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2535(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
