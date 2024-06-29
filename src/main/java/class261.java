import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public abstract class class261 implements class264 {
   @OriginalMember(
      owner = "client!maa",
      name = "f",
      descriptor = "I"
   )
   private int field4284 = 0;
   @OriginalMember(
      owner = "client!maa",
      name = "k",
      descriptor = "I"
   )
   private int field4292 = -1;
   @OriginalMember(
      owner = "client!maa",
      name = "u",
      descriptor = "Lcka;"
   )
   public class174 field4280;
   @OriginalMember(
      owner = "client!maa",
      name = "p",
      descriptor = "I"
   )
   private int field4295;
   @OriginalMember(
      owner = "client!maa",
      name = "t",
      descriptor = "Z"
   )
   private boolean field4279;
   @OriginalMember(
      owner = "client!maa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4300 = new String[]{method2273(method2272("47R\u0004{q")), method2273(method2272("47R\u0004|q")), method2273(method2272("47R\u0004wq")), method2273(method2272("47R\u0004Y08RFV#3\u001b")), method2273(method2272("47R\u0004}q")), method2273(method2272("7#_F")), method2273(method2272("\"x\u001d\u0004B")), method2273(method2272("47R\u0004\u000308Z^\u0001q")), method2273(method2272("47R\u0004~q")), method2273(method2272("47R\u0004yq")), method2273(method2272("47R\u0004tq")), method2273(method2272("47R\u0004vq")), method2273(method2272("47R\u0004uq")), method2273(method2272("\u0018\u0004tb\u001e")), method2273(method2272("47R\u0004zq")), method2273(method2272("47R\u0004xq"))};
   @OriginalMember(
      owner = "client!maa",
      name = "h",
      descriptor = "Z"
   )
   public static boolean field4293 = false;
   @OriginalMember(
      owner = "client!maa",
      name = "m",
      descriptor = "I"
   )
   private int field4281;
   @OriginalMember(
      owner = "client!maa",
      name = "l",
      descriptor = "I"
   )
   public static int field4282;
   @OriginalMember(
      owner = "client!maa",
      name = "r",
      descriptor = "I"
   )
   public static int field4283;
   @OriginalMember(
      owner = "client!maa",
      name = "j",
      descriptor = "I"
   )
   public static int field4285;
   @OriginalMember(
      owner = "client!maa",
      name = "o",
      descriptor = "I"
   )
   public static int field4286;
   @OriginalMember(
      owner = "client!maa",
      name = "s",
      descriptor = "I"
   )
   public static int field4287;
   @OriginalMember(
      owner = "client!maa",
      name = "n",
      descriptor = "I"
   )
   public static int field4289;
   @OriginalMember(
      owner = "client!maa",
      name = "e",
      descriptor = "I"
   )
   public static int field4291;
   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "I"
   )
   public static int field4294;
   @OriginalMember(
      owner = "client!maa",
      name = "d",
      descriptor = "I"
   )
   public static int field4296;
   @OriginalMember(
      owner = "client!maa",
      name = "q",
      descriptor = "I"
   )
   public static int field4297;
   @OriginalMember(
      owner = "client!maa",
      name = "c",
      descriptor = "I"
   )
   public static int field4298;
   @OriginalMember(
      owner = "client!maa",
      name = "i",
      descriptor = "I"
   )
   private int field4299;
   @OriginalMember(
      owner = "client!maa",
      name = "b",
      descriptor = "Lti;"
   )
   public static class80 field4290;
   @OriginalMember(
      owner = "client!maa",
      name = "g",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   private NativeHeapBuffer field4288;

   @OriginalMember(
      owner = "client!maa",
      name = "c",
      descriptor = "(B)V",
      line = 3
   )
   private final void method2263(byte arg0) {
      try {
         ++field4298;
         if (this.field4292 < 0) {
            int var2 = -112 % ((-60 - arg0) / 61);
            if (this.field4280.field2731) {
               OpenGL.glGenBuffersARB(1, class80.field1094, 0);
               this.field4292 = class80.field1094[0];
               OpenGL.glBindBufferARB(this.field4295, this.field4292);
            } else {
               this.field4292 = 0;
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4300[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(Ljaggl/MapBuffer;ZI)Ljaclib/memory/Buffer;",
      line = 26
   )
   public final Buffer method2264(MapBuffer arg0, boolean arg1, int arg2) {
      try {
         ++field4283;
         if (arg2 != 35001) {
            this.method2267((byte)42);
         }

         if (~this.field4284 == -1) {
            this.method2263((byte)-127);
            if (this.field4292 <= 0) {
               this.field4284 = 2;
               return this.field4288;
            }

            OpenGL.glBindBufferARB(this.field4295, this.field4292);
            if (arg1) {
               OpenGL.glBufferDataARBub(this.field4295, this.field4299, (byte[])null, 0, this.field4279 ? 35040 : 35044);
               if (this.field4280.field4016.field10678 >= this.field4281) {
                  this.field4284 = 1;
                  return this.field4280.field4016;
               }
            }

            if (!arg0.method5264() && arg0.method5265(this.field4295, this.field4281, 35001)) {
               this.field4284 = 2;
               return arg0;
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4300[14] + (arg0 != null ? field4300[6] : field4300[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(IIIZI)Lqca;",
      line = 73
   )
   public static final class276 method2265(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
      try {
         ++field4282;
         class276 var5 = new class276();
         var5.field4404 = arg4;
         var5.field4406 = arg2;
         class507.field7766.method3143(58, var5, (long)arg0);
         class624.method4578(119, arg4);
         class374 var6 = class183.method1658(arg0, 113);
         if (var6 != null) {
            class573.method4310((byte)-116, var6);
         }

         if (class387.field6083 != null) {
            class573.method4310((byte)-62, class387.field6083);
            class387.field6083 = null;
         }

         class44.method318((byte)25);
         if (var6 != null) {
            class127.method1197(false, !arg3, var6);
         }

         if (arg1 >= -111) {
            method2268(false);
         }

         if (!arg3) {
            class469.method3639(arg4);
         }

         if (!arg3 && ~class288.field4539 != 0) {
            class271.method2314((byte)-123, 1, class288.field4539);
         }

         return var5;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4300[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(B)V",
      line = 115
   )
   public final void method2266(byte arg0) {
      try {
         ++field4291;
         if (this.field4280.field2731) {
            OpenGL.glBindBufferARB(this.field4295, this.field4292);
         }

         if (arg0 > -2) {
            this.field4284 = 123;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4300[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "b",
      descriptor = "(B)J",
      line = 133
   )
   public final long method2267(byte arg0) {
      try {
         if (arg0 < 114) {
            method2268(false);
         }

         ++field4285;
         return this.field4292 != 0 ? 0L : this.field4288.getAddress();
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4300[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(Z)V",
      line = 145
   )
   public static void method2268(boolean arg0) {
      try {
         field4290 = null;
         if (!arg0) {
            method2265(82, 32, 65, true, -121);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4300[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "finalize",
      descriptor = "()V",
      line = 155
   )
   protected final void finalize() throws Throwable {
      try {
         ++field4294;
         this.method1533(16966);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4300[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(II)V",
      line = 164
   )
   public void method2269(int arg0, int arg1) {
      try {
         ++field4289;
         if (~arg0 < ~this.field4299) {
            label28: {
               this.method2263((byte)73);
               if (this.field4292 > 0) {
                  OpenGL.glBindBufferARB(this.field4295, this.field4292);
                  OpenGL.glBufferDataARBub(this.field4295, arg0, (byte[])null, 0, this.field4279 ? 35040 : 35044);
                  this.field4280.field4128 += -this.field4299 + arg0;
                  if (!client.field1786) {
                     break label28;
                  }
               }

               this.field4288 = this.field4280.method2206(false, (byte)-37, arg0);
            }

            this.field4299 = arg0;
         }

         if (arg1 == 32198) {
            this.field4281 = arg0;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4300[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "<init>",
      descriptor = "(Lcka;IZ)V",
      line = 316
   )
   public class261(class174 arg0, int arg1, boolean arg2) {
      try {
         this.field4280 = arg0;
         this.field4295 = arg1;
         this.field4279 = arg2;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4300[7] + (arg0 != null ? field4300[6] : field4300[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(ILjaggl/MapBuffer;)Z",
      line = 200
   )
   public final boolean method2270(int arg0, MapBuffer arg1) {
      try {
         if (arg0 < 123) {
            return false;
         } else {
            ++field4296;
            boolean var3 = true;
            if (this.field4284 != 0) {
               if (this.field4292 > 0) {
                  label41: {
                     OpenGL.glBindBufferARB(this.field4295, this.field4292);
                     if (~this.field4284 == -2) {
                        OpenGL.glBufferSubDataARBa(this.field4295, 0, this.field4299, this.field4280.field4016.getAddress());
                        if (!client.field1786) {
                           break label41;
                        }
                     }

                     var3 = arg1.method5263();
                  }
               }

               this.field4284 = 0;
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4300[8] + arg0 + ',' + (arg1 != null ? field4300[6] : field4300[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "d",
      descriptor = "(I)I",
      line = 232
   )
   public int method1538(int arg0) {
      try {
         ++field4287;
         return arg0 <= 13 ? -50 : this.field4281;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4300[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(I)V",
      line = 246
   )
   public void method1533(int arg0) {
      try {
         if (arg0 != 16966) {
            field4290 = null;
         }

         if (~this.field4292 < -1) {
            this.field4280.method1598(9472, this.field4292, this.field4281);
            this.field4292 = -1;
         }

         ++field4297;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4300[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(IILjaclib/memory/Source;)Z",
      line = 262
   )
   public final boolean method2271(int arg0, int arg1, Source arg2) {
      try {
         if (arg1 > -31) {
            return false;
         } else {
            ++field4286;
            if (arg0 <= this.field4299) {
               if (~this.field4292 >= -1) {
                  throw new RuntimeException(field4300[13]);
               }

               OpenGL.glBindBufferARB(this.field4295, this.field4292);
               OpenGL.glBufferSubDataARBa(this.field4295, 0, this.field4281, arg2.getAddress());
               this.field4280.field4128 += -this.field4281 + arg0;
               if (client.field1786) {
                  throw new RuntimeException(field4300[13]);
               }
            } else {
               this.method2263((byte)39);
               if (~this.field4292 >= -1) {
                  throw new RuntimeException(field4300[13]);
               }

               OpenGL.glBindBufferARB(this.field4295, this.field4292);
               OpenGL.glBufferDataARBa(this.field4295, arg0, arg2.getAddress(), this.field4279 ? 35040 : 35044);
               this.field4280.field4128 += -this.field4281 + arg0;
               this.field4299 = arg0;
            }

            this.field4281 = arg0;
            return true;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4300[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4300[6] : field4300[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2272(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!maa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2273(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
