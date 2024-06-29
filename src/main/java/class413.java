import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public abstract class class413 implements class523 {
   @OriginalMember(
      owner = "client!hf",
      name = "g",
      descriptor = "I"
   )
   private int field6044 = -1;
   @OriginalMember(
      owner = "client!hf",
      name = "h",
      descriptor = "I"
   )
   private int field6050 = 0;
   @OriginalMember(
      owner = "client!hf",
      name = "i",
      descriptor = "Lbba;"
   )
   public class124 field6048;
   @OriginalMember(
      owner = "client!hf",
      name = "c",
      descriptor = "Z"
   )
   private boolean field6054;
   @OriginalMember(
      owner = "client!hf",
      name = "b",
      descriptor = "I"
   )
   private int field6056;
   @OriginalMember(
      owner = "client!hf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6059 = new String[]{method3160(method3159("\u0007YB^Z")), method3160(method3159("\u0007YBXZ")), method3160(method3159("\u0007YB_Z")), method3160(method3159("\u0007YBLZ")), method3160(method3159("\u0007YBK3G")), method3160(method3159("\u0014\u0011B$\u000f")), method3160(method3159("\u0007YB6\u001b\u0001V\u00184Z")), method3160(method3159("\u0001J\u0000f")), method3160(method3159("\u0007YB]Z")), method3160(method3159("\u0007YBYZ")), method3160(method3159(".m+BS")), method3160(method3159("\u0007YB[Z")), method3160(method3159("\u0007YBl\u001b\u0001^\u0000c\b\n\u0017")), method3160(method3159("\u0007YBKZ")), method3160(method3159("\u0007YB\\Z")), method3160(method3159("\u0007YBEZ"))};
   @OriginalMember(
      owner = "client!hf",
      name = "k",
      descriptor = "I"
   )
   public static int field6047 = 0;
   @OriginalMember(
      owner = "client!hf",
      name = "u",
      descriptor = "I"
   )
   public static int field6038;
   @OriginalMember(
      owner = "client!hf",
      name = "s",
      descriptor = "I"
   )
   public static int field6039;
   @OriginalMember(
      owner = "client!hf",
      name = "m",
      descriptor = "I"
   )
   private int field6040;
   @OriginalMember(
      owner = "client!hf",
      name = "l",
      descriptor = "I"
   )
   public static int field6041;
   @OriginalMember(
      owner = "client!hf",
      name = "a",
      descriptor = "I"
   )
   public static int field6042;
   @OriginalMember(
      owner = "client!hf",
      name = "f",
      descriptor = "I"
   )
   public static int field6045;
   @OriginalMember(
      owner = "client!hf",
      name = "e",
      descriptor = "I"
   )
   public static int field6046;
   @OriginalMember(
      owner = "client!hf",
      name = "d",
      descriptor = "I"
   )
   public static int field6049;
   @OriginalMember(
      owner = "client!hf",
      name = "r",
      descriptor = "I"
   )
   public static int field6051;
   @OriginalMember(
      owner = "client!hf",
      name = "n",
      descriptor = "I"
   )
   private int field6052;
   @OriginalMember(
      owner = "client!hf",
      name = "p",
      descriptor = "I"
   )
   public static int field6053;
   @OriginalMember(
      owner = "client!hf",
      name = "t",
      descriptor = "I"
   )
   public static int field6055;
   @OriginalMember(
      owner = "client!hf",
      name = "j",
      descriptor = "I"
   )
   public static int field6057;
   @OriginalMember(
      owner = "client!hf",
      name = "q",
      descriptor = "I"
   )
   public static int field6058;
   @OriginalMember(
      owner = "client!hf",
      name = "o",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   private NativeHeapBuffer field6043;

   @OriginalMember(
      owner = "client!hf",
      name = "a",
      descriptor = "(Ljaggl/MapBuffer;BZ)Ljaclib/memory/Buffer;"
   )
   public final Buffer method3151(MapBuffer arg0, byte arg1, boolean arg2) {
      try {
         if (arg1 != -121) {
            this.field6056 = 41;
         }

         ++field6058;
         if (this.field6050 == 0) {
            this.method3153(40);
            if (~this.field6044 >= -1) {
               this.field6050 = 2;
               return this.field6043;
            }

            OpenGL.glBindBufferARB(this.field6056, this.field6044);
            if (arg2) {
               OpenGL.glBufferDataARBub(this.field6056, this.field6040, (byte[])null, 0, this.field6054 ? 35040 : 35044);
               if (~this.field6052 >= ~this.field6048.field5098.field10227) {
                  this.field6050 = 1;
                  return this.field6048.field5098;
               }
            }

            if (!arg0.method4765() && arg0.method4766(this.field6056, this.field6052, 35001)) {
               this.field6050 = 2;
               return arg0;
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6059[11] + (arg0 != null ? field6059[5] : field6059[7]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "a",
      descriptor = "(BLjaggl/MapBuffer;)Z"
   )
   public final boolean method3152(byte arg0, MapBuffer arg1) {
      try {
         ++field6045;
         if (arg0 > -20) {
            return true;
         } else {
            boolean var3 = true;
            if (this.field6050 != 0) {
               if (this.field6044 > 0) {
                  label40: {
                     OpenGL.glBindBufferARB(this.field6056, this.field6044);
                     if (~this.field6050 != -2) {
                        var3 = arg1.method4767();
                        if (!client.field4564) {
                           break label40;
                        }
                     }

                     OpenGL.glBufferSubDataARBa(this.field6056, 0, this.field6040, this.field6048.field5098.getAddress());
                  }
               }

               this.field6050 = 0;
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6059[14] + arg0 + ',' + (arg1 != null ? field6059[5] : field6059[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "e",
      descriptor = "(I)V"
   )
   private final void method3153(int arg0) {
      try {
         ++field6049;
         if (arg0 <= 8) {
            this.field6040 = 8;
         }

         if (~this.field6044 > -1) {
            if (this.field6048.field2090) {
               OpenGL.glGenBuffersARB(1, client.field4562, 0);
               this.field6044 = client.field4562[0];
               OpenGL.glBindBufferARB(this.field6056, this.field6044);
            } else {
               this.field6044 = 0;
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6059[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "a",
      descriptor = "(I)I"
   )
   public int method570(int arg0) {
      try {
         if (arg0 != 1) {
            return -67;
         } else {
            ++field6039;
            return this.field6052;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6059[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field6041;
         this.method574(29079);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6059[12] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "a",
      descriptor = "(Z)J"
   )
   public final long method3154(boolean arg0) {
      try {
         if (!arg0) {
            field6047 = -95;
         }

         ++field6038;
         return this.field6044 != 0 ? 0L : this.field6043.getAddress();
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6059[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method3155(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != -1) {
            return false;
         } else {
            ++field6055;
            return ~(arg0 & 34) != -1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6059[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "<init>",
      descriptor = "(Lbba;IZ)V"
   )
   public class413(class124 arg0, int arg1, boolean arg2) {
      try {
         this.field6048 = arg0;
         this.field6054 = arg2;
         this.field6056 = arg1;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6059[6] + (arg0 != null ? field6059[5] : field6059[7]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3156(byte arg0) {
      try {
         if (this.field6048.field2090) {
            OpenGL.glBindBufferARB(this.field6056, this.field6044);
         }

         int var2 = -100 / ((73 - arg0) / 32);
         ++field6051;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6059[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "a",
      descriptor = "(IILjaclib/memory/Source;)Z"
   )
   public final boolean method3157(int arg0, int arg1, Source arg2) {
      boolean var4 = client.field4564;

      try {
         label53: {
            ++field6053;
            if (arg0 > this.field6040) {
               this.method3153(17);
               if (~this.field6044 >= -1) {
                  throw new RuntimeException(field6059[10]);
               }

               OpenGL.glBindBufferARB(this.field6056, this.field6044);
               OpenGL.glBufferDataARBa(this.field6056, arg0, arg2.getAddress(), !this.field6054 ? 35044 : 35040);
               this.field6048.field5217 += -this.field6052 + arg0;
               if (var4) {
                  throw new RuntimeException(field6059[10]);
               }

               this.field6040 = arg0;
               if (!var4) {
                  break label53;
               }
            }

            if (~this.field6044 >= -1) {
               throw new RuntimeException(field6059[10]);
            }

            OpenGL.glBindBufferARB(this.field6056, this.field6044);
            OpenGL.glBufferSubDataARBa(this.field6056, 0, this.field6052, arg2.getAddress());
            this.field6048.field5217 += arg0 - this.field6052;
         }

         if (arg1 != -1) {
            return false;
         } else {
            this.field6052 = arg0;
            return true;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6059[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6059[5] : field6059[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "d",
      descriptor = "(I)V"
   )
   public void method574(int arg0) {
      try {
         if (arg0 != 29079) {
            this.method3157(-122, -13, (Source)null);
         }

         ++field6042;
         if (this.field6044 > 0) {
            this.field6048.method1162(this.field6052, this.field6044, -5419);
            this.field6044 = -1;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6059[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "a",
      descriptor = "(II)V"
   )
   public void method2189(int arg0, int arg1) {
      try {
         if (arg0 != 27288) {
            this.field6040 = 81;
         }

         if (this.field6040 < arg1) {
            label27: {
               this.method3153(80);
               if (this.field6044 > 0) {
                  OpenGL.glBindBufferARB(this.field6056, this.field6044);
                  OpenGL.glBufferDataARBub(this.field6056, arg1, (byte[])null, 0, !this.field6054 ? 35044 : 35040);
                  this.field6048.field5217 += -this.field6040 + arg1;
                  if (!client.field4564) {
                     break label27;
                  }
               }

               this.field6043 = this.field6048.method2753(false, (byte)21, arg1);
            }

            this.field6040 = arg1;
         }

         ++field6057;
         this.field6052 = arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6059[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method3158(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3159(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3160(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
