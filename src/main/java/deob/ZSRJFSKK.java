package deob;

@ObfuscatedName("ZSRJFSKK")
public class ZSRJFSKK {

	@ObfuscatedName("ZSRJFSKK.f")
	public int field1476 = 0;

	@ObfuscatedName("ZSRJFSKK.g")
	public int field1477 = 0;

	@ObfuscatedName("ZSRJFSKK.h")
	public int field1478;

	@ObfuscatedName("ZSRJFSKK.i")
	public int field1479;

	@ObfuscatedName("ZSRJFSKK.j")
	public int[][] field1480;

	public ZSRJFSKK(int arg0, int arg1) {
		field1478 = arg1;
		field1479 = arg0;
		field1480 = new int[field1478][field1479];
		method576();
	}

	@ObfuscatedName("ZSRJFSKK.a()V")
	public void method576() {
		for (int var1 = 0; var1 < field1478; var1++) {
			for (int var2 = 0; var2 < field1479; var2++) {
				if (var1 == 0 || var2 == 0 || field1478 - 1 == var1 || field1479 - 1 == var2) {
					field1480[var1][var2] = 0xFFFFFF;
				} else {
					field1480[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("ZSRJFSKK.a(IZIIII)V")
	public void method577(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg1 -= field1476;
		arg2 -= field1477;
		if (arg4 == 0) {
			if (arg3 == 0) {
				method580(arg1, arg2, 128);
				method580(arg1 - 1, arg2, 8);
			}

			if (arg3 == 1) {
				method580(arg1, arg2, 2);
				method580(arg1, arg2 + 1, 32);
			}

			if (arg3 == 2) {
				method580(arg1, arg2, 8);
				method580(arg1 + 1, arg2, 128);
			}

			if (arg3 == 3) {
				method580(arg1, arg2, 32);
				method580(arg1, arg2 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				method580(arg1, arg2, 1);
				method580(arg1 - 1, arg2 + 1, 16);
			}

			if (arg3 == 1) {
				method580(arg1, arg2, 4);
				method580(arg1 + 1, arg2 + 1, 64);
			}

			if (arg3 == 2) {
				method580(arg1, arg2, 16);
				method580(arg1 + 1, arg2 - 1, 1);
			}

			if (arg3 == 3) {
				method580(arg1, arg2, 64);
				method580(arg1 - 1, arg2 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg3 == 0) {
				method580(arg1, arg2, 130);
				method580(arg1 - 1, arg2, 8);
				method580(arg1, arg2 + 1, 32);
			}

			if (arg3 == 1) {
				method580(arg1, arg2, 10);
				method580(arg1, arg2 + 1, 32);
				method580(arg1 + 1, arg2, 128);
			}

			if (arg3 == 2) {
				method580(arg1, arg2, 40);
				method580(arg1 + 1, arg2, 128);
				method580(arg1, arg2 - 1, 2);
			}

			if (arg3 == 3) {
				method580(arg1, arg2, 160);
				method580(arg1, arg2 - 1, 2);
				method580(arg1 - 1, arg2, 8);
			}
		}

		if (arg0) {
			if (arg4 == 0) {
				if (arg3 == 0) {
					method580(arg1, arg2, 0x10000);
					method580(arg1 - 1, arg2, 4096);
				}

				if (arg3 == 1) {
					method580(arg1, arg2, 1024);
					method580(arg1, arg2 + 1, 16384);
				}

				if (arg3 == 2) {
					method580(arg1, arg2, 4096);
					method580(arg1 + 1, arg2, 0x10000);
				}

				if (arg3 == 3) {
					method580(arg1, arg2, 16384);
					method580(arg1, arg2 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					method580(arg1, arg2, 512);
					method580(arg1 - 1, arg2 + 1, 8192);
				}

				if (arg3 == 1) {
					method580(arg1, arg2, 2048);
					method580(arg1 + 1, arg2 + 1, 32768);
				}

				if (arg3 == 2) {
					method580(arg1, arg2, 8192);
					method580(arg1 + 1, arg2 - 1, 512);
				}

				if (arg3 == 3) {
					method580(arg1, arg2, 32768);
					method580(arg1 - 1, arg2 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg3 == 0) {
					method580(arg1, arg2, 66560);
					method580(arg1 - 1, arg2, 4096);
					method580(arg1, arg2 + 1, 16384);
				}

				if (arg3 == 1) {
					method580(arg1, arg2, 5120);
					method580(arg1, arg2 + 1, 16384);
					method580(arg1 + 1, arg2, 0x10000);
				}

				if (arg3 == 2) {
					method580(arg1, arg2, 20480);
					method580(arg1 + 1, arg2, 0x10000);
					method580(arg1, arg2 - 1, 1024);
				}

				if (arg3 == 3) {
					method580(arg1, arg2, 81920);
					method580(arg1, arg2 - 1, 1024);
					method580(arg1 - 1, arg2, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ZSRJFSKK.a(IIIBZII)V")
	public void method578(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg1 -= field1476;
		arg2 -= field1477;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg5;
			arg5 = arg0;
			arg0 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg5; var9++) {
			if (var9 >= 0 && var9 < field1478) {
				for (int var10 = arg2; var10 < arg0 + arg2; var10++) {
					if (var10 >= 0 && var10 < field1479) {
						method580(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ZSRJFSKK.a(IBI)V")
	public void method579(int arg0, int arg1) {
		arg0 -= field1476;
		arg1 -= field1477;
		field1480[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("ZSRJFSKK.a(III)V")
	public void method580(int arg0, int arg1, int arg2) {
		field1480[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("ZSRJFSKK.a(IZIZII)V")
	public void method581(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg3 -= field1476;
		arg0 -= field1477;
		if (arg4 == 0) {
			if (arg1 == 0) {
				method583(128, arg3, arg0);
				method583(8, arg3 - 1, arg0);
			}

			if (arg1 == 1) {
				method583(2, arg3, arg0);
				method583(32, arg3, arg0 + 1);
			}

			if (arg1 == 2) {
				method583(8, arg3, arg0);
				method583(128, arg3 + 1, arg0);
			}

			if (arg1 == 3) {
				method583(32, arg3, arg0);
				method583(2, arg3, arg0 - 1);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				method583(1, arg3, arg0);
				method583(16, arg3 - 1, arg0 + 1);
			}

			if (arg1 == 1) {
				method583(4, arg3, arg0);
				method583(64, arg3 + 1, arg0 + 1);
			}

			if (arg1 == 2) {
				method583(16, arg3, arg0);
				method583(1, arg3 + 1, arg0 - 1);
			}

			if (arg1 == 3) {
				method583(64, arg3, arg0);
				method583(4, arg3 - 1, arg0 - 1);
			}
		}

		if (arg4 == 2) {
			if (arg1 == 0) {
				method583(130, arg3, arg0);
				method583(8, arg3 - 1, arg0);
				method583(32, arg3, arg0 + 1);
			}

			if (arg1 == 1) {
				method583(10, arg3, arg0);
				method583(32, arg3, arg0 + 1);
				method583(128, arg3 + 1, arg0);
			}

			if (arg1 == 2) {
				method583(40, arg3, arg0);
				method583(128, arg3 + 1, arg0);
				method583(2, arg3, arg0 - 1);
			}

			if (arg1 == 3) {
				method583(160, arg3, arg0);
				method583(2, arg3, arg0 - 1);
				method583(8, arg3 - 1, arg0);
			}
		}

		if (arg2) {
			if (arg4 == 0) {
				if (arg1 == 0) {
					method583(0x10000, arg3, arg0);
					method583(4096, arg3 - 1, arg0);
				}

				if (arg1 == 1) {
					method583(1024, arg3, arg0);
					method583(16384, arg3, arg0 + 1);
				}

				if (arg1 == 2) {
					method583(4096, arg3, arg0);
					method583(0x10000, arg3 + 1, arg0);
				}

				if (arg1 == 3) {
					method583(16384, arg3, arg0);
					method583(1024, arg3, arg0 - 1);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					method583(512, arg3, arg0);
					method583(8192, arg3 - 1, arg0 + 1);
				}

				if (arg1 == 1) {
					method583(2048, arg3, arg0);
					method583(32768, arg3 + 1, arg0 + 1);
				}

				if (arg1 == 2) {
					method583(8192, arg3, arg0);
					method583(512, arg3 + 1, arg0 - 1);
				}

				if (arg1 == 3) {
					method583(32768, arg3, arg0);
					method583(2048, arg3 - 1, arg0 - 1);
				}
			}

			if (arg4 == 2) {
				if (arg1 == 0) {
					method583(66560, arg3, arg0);
					method583(4096, arg3 - 1, arg0);
					method583(16384, arg3, arg0 + 1);
				}

				if (arg1 == 1) {
					method583(5120, arg3, arg0);
					method583(16384, arg3, arg0 + 1);
					method583(0x10000, arg3 + 1, arg0);
				}

				if (arg1 == 2) {
					method583(20480, arg3, arg0);
					method583(0x10000, arg3 + 1, arg0);
					method583(1024, arg3, arg0 - 1);
				}

				if (arg1 == 3) {
					method583(81920, arg3, arg0);
					method583(1024, arg3, arg0 - 1);
					method583(4096, arg3 - 1, arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ZSRJFSKK.a(IZIIIII)V")
	public void method582(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg1) {
			var7 += 0x20000;
		}

		arg0 -= field1476;
		arg3 -= field1477;

		if (arg5 == 1 || arg5 == 3) {
			int var8 = arg4;
			arg4 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg4; var9++) {
			if (var9 >= 0 && var9 < field1478) {
				for (int var10 = arg3; var10 < arg2 + arg3; var10++) {
					if (var10 >= 0 && var10 < field1479) {
						method583(var7, var9, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("ZSRJFSKK.a(IBII)V")
	public void method583(int arg0, int arg1, int arg2) {
		field1480[arg1][arg2] &= 0xFFFFFF - arg0;
	}

	@ObfuscatedName("ZSRJFSKK.b(III)V")
	public void method584(int arg0, int arg1) {
		arg1 -= field1476;
		arg0 -= field1477;
		field1480[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("ZSRJFSKK.a(IIIZIII)Z")
	public boolean method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 == arg5 && arg0 == arg3) {
			return true;
		}

		arg5 -= field1476;
		arg3 -= field1477;
		arg4 -= field1476;
		arg0 -= field1477;
		if (arg2 == 0) {
			if (arg1 == 0) {
				if (arg4 - 1 == arg5 && arg0 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg3 && (field1480[arg5][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg3 && (field1480[arg5][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg4 == arg5 && arg0 + 1 == arg3) {
					return true;
				}

				if (arg4 - 1 == arg5 && arg0 == arg3 && (field1480[arg5][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg0 == arg3 && (field1480[arg5][arg3] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg4 + 1 == arg5 && arg0 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg3 && (field1480[arg5][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg3 && (field1480[arg5][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg4 == arg5 && arg0 - 1 == arg3) {
					return true;
				}

				if (arg4 - 1 == arg5 && arg0 == arg3 && (field1480[arg5][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg0 == arg3 && (field1480[arg5][arg3] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 2) {
			if (arg1 == 0) {
				if (arg4 - 1 == arg5 && arg0 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg3) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg0 == arg3 && (field1480[arg5][arg3] & 0x1280180) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg3 && (field1480[arg5][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg4 - 1 == arg5 && arg0 == arg3 && (field1480[arg5][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg3) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg0 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg3 && (field1480[arg5][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg4 - 1 == arg5 && arg0 == arg3 && (field1480[arg5][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg3 && (field1480[arg5][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg0 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg3) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg4 - 1 == arg5 && arg0 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg0 + 1 == arg3 && (field1480[arg5][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg0 == arg3 && (field1480[arg5][arg3] & 0x1280180) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg0 - 1 == arg3) {
					return true;
				}
			}
		}

		if (arg2 == 9) {
			if (arg4 == arg5 && arg0 + 1 == arg3 && (field1480[arg5][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg4 == arg5 && arg0 - 1 == arg3 && (field1480[arg5][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg5 && arg0 == arg3 && (field1480[arg5][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg5 && arg0 == arg3 && (field1480[arg5][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ZSRJFSKK.a(IIIIIII)Z")
	public boolean method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 == arg5 && arg1 == arg2) {
			return true;
		}

		arg4 -= field1476;
		arg2 -= field1477;
		arg5 -= field1476;
		arg1 -= field1477;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}

			if (arg0 == 0) {
				if (arg5 + 1 == arg4 && arg1 == arg2 && (field1480[arg4][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg1 - 1 == arg2 && (field1480[arg4][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg5 - 1 == arg4 && arg1 == arg2 && (field1480[arg4][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg1 - 1 == arg2 && (field1480[arg4][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg5 - 1 == arg4 && arg1 == arg2 && (field1480[arg4][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg1 + 1 == arg2 && (field1480[arg4][arg2] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg5 + 1 == arg4 && arg1 == arg2 && (field1480[arg4][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg1 + 1 == arg2 && (field1480[arg4][arg2] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg3 == 8) {
			if (arg4 == arg5 && arg1 + 1 == arg2 && (field1480[arg4][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg4 == arg5 && arg1 - 1 == arg2 && (field1480[arg4][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg5 - 1 == arg4 && arg1 == arg2 && (field1480[arg4][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg5 + 1 == arg4 && arg1 == arg2 && (field1480[arg4][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ZSRJFSKK.a(IIIIIIII)Z")
	public boolean method587(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg4 + arg5 - 1;
		int var9 = arg2 + arg3 - 1;
		if (arg1 >= arg4 && arg1 <= var8 && arg0 >= arg3 && arg0 <= var9) {
			return true;
		}

		if (arg4 - 1 == arg1 && arg0 >= arg3 && arg0 <= var9 && (field1480[arg1 - field1476][arg0 - field1477] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg1 && arg0 >= arg3 && arg0 <= var9 && (field1480[arg1 - field1476][arg0 - field1477] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		}

		if (arg3 - 1 == arg0 && arg1 >= arg4 && arg1 <= var8 && (field1480[arg1 - field1476][arg0 - field1477] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg0 && arg1 >= arg4 && arg1 <= var8 && (field1480[arg1 - field1476][arg0 - field1477] & 0x20) == 0 && (arg6 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
