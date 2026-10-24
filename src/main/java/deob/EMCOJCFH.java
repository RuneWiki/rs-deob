package deob;

@ObfuscatedName("EMCOJCFH")
public class EMCOJCFH {

	@ObfuscatedName("EMCOJCFH.g")
	public int field664 = 0;

	@ObfuscatedName("EMCOJCFH.h")
	public int field665 = 0;

	@ObfuscatedName("EMCOJCFH.i")
	public int field666;

	@ObfuscatedName("EMCOJCFH.j")
	public int field667;

	@ObfuscatedName("EMCOJCFH.k")
	public int[][] field668;

	public EMCOJCFH(int arg0, int arg1) {
		field666 = arg0;
		field667 = arg1;
		field668 = new int[field666][field667];
		method205();
	}

	@ObfuscatedName("EMCOJCFH.a()V")
	public void method205() {
		for (int var1 = 0; var1 < field666; var1++) {
			for (int var2 = 0; var2 < field667; var2++) {
				if (var1 == 0 || var2 == 0 || field666 - 1 == var1 || field667 - 1 == var2) {
					field668[var1][var2] = 0xFFFFFF;
				} else {
					field668[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("EMCOJCFH.a(IIIZII)V")
	public void method206(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg2 -= field664;
		arg1 -= field665;
		if (arg0 == 0) {
			if (arg4 == 0) {
				method209(arg2, arg1, 128);
				method209(arg2 - 1, arg1, 8);
			}

			if (arg4 == 1) {
				method209(arg2, arg1, 2);
				method209(arg2, arg1 + 1, 32);
			}

			if (arg4 == 2) {
				method209(arg2, arg1, 8);
				method209(arg2 + 1, arg1, 128);
			}

			if (arg4 == 3) {
				method209(arg2, arg1, 32);
				method209(arg2, arg1 - 1, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				method209(arg2, arg1, 1);
				method209(arg2 - 1, arg1 + 1, 16);
			}

			if (arg4 == 1) {
				method209(arg2, arg1, 4);
				method209(arg2 + 1, arg1 + 1, 64);
			}

			if (arg4 == 2) {
				method209(arg2, arg1, 16);
				method209(arg2 + 1, arg1 - 1, 1);
			}

			if (arg4 == 3) {
				method209(arg2, arg1, 64);
				method209(arg2 - 1, arg1 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg4 == 0) {
				method209(arg2, arg1, 130);
				method209(arg2 - 1, arg1, 8);
				method209(arg2, arg1 + 1, 32);
			}

			if (arg4 == 1) {
				method209(arg2, arg1, 10);
				method209(arg2, arg1 + 1, 32);
				method209(arg2 + 1, arg1, 128);
			}

			if (arg4 == 2) {
				method209(arg2, arg1, 40);
				method209(arg2 + 1, arg1, 128);
				method209(arg2, arg1 - 1, 2);
			}

			if (arg4 == 3) {
				method209(arg2, arg1, 160);
				method209(arg2, arg1 - 1, 2);
				method209(arg2 - 1, arg1, 8);
			}
		}

		if (arg3) {
			if (arg0 == 0) {
				if (arg4 == 0) {
					method209(arg2, arg1, 0x10000);
					method209(arg2 - 1, arg1, 4096);
				}

				if (arg4 == 1) {
					method209(arg2, arg1, 1024);
					method209(arg2, arg1 + 1, 16384);
				}

				if (arg4 == 2) {
					method209(arg2, arg1, 4096);
					method209(arg2 + 1, arg1, 0x10000);
				}

				if (arg4 == 3) {
					method209(arg2, arg1, 16384);
					method209(arg2, arg1 - 1, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg4 == 0) {
					method209(arg2, arg1, 512);
					method209(arg2 - 1, arg1 + 1, 8192);
				}

				if (arg4 == 1) {
					method209(arg2, arg1, 2048);
					method209(arg2 + 1, arg1 + 1, 32768);
				}

				if (arg4 == 2) {
					method209(arg2, arg1, 8192);
					method209(arg2 + 1, arg1 - 1, 512);
				}

				if (arg4 == 3) {
					method209(arg2, arg1, 32768);
					method209(arg2 - 1, arg1 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg4 == 0) {
					method209(arg2, arg1, 66560);
					method209(arg2 - 1, arg1, 4096);
					method209(arg2, arg1 + 1, 16384);
				}

				if (arg4 == 1) {
					method209(arg2, arg1, 5120);
					method209(arg2, arg1 + 1, 16384);
					method209(arg2 + 1, arg1, 0x10000);
				}

				if (arg4 == 2) {
					method209(arg2, arg1, 20480);
					method209(arg2 + 1, arg1, 0x10000);
					method209(arg2, arg1 - 1, 1024);
				}

				if (arg4 == 3) {
					method209(arg2, arg1, 81920);
					method209(arg2, arg1 - 1, 1024);
					method209(arg2 - 1, arg1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("EMCOJCFH.a(ZIIIZII)V")
	public void method207(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg5 -= field664;
		arg2 -= field665;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg1;
			arg1 = arg0;
			arg0 = var8;
		}

		for (int var9 = arg5; var9 < arg1 + arg5; var9++) {
			if (var9 >= 0 && var9 < field666) {
				for (int var10 = arg2; var10 < arg0 + arg2; var10++) {
					if (var10 >= 0 && var10 < field667) {
						method209(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("EMCOJCFH.a(BII)V")
	public void method208(int arg0, int arg1) {
		arg1 -= field664;
		arg0 -= field665;
		field668[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("EMCOJCFH.a(III)V")
	public void method209(int arg0, int arg1, int arg2) {
		field668[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("EMCOJCFH.a(IIZIZI)V")
	public void method210(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg0 -= field664;
		arg3 -= field665;
		if (arg4 == 0) {
			if (arg1 == 0) {
				method212(arg0, arg3, 128);
				method212(arg0 - 1, arg3, 8);
			}

			if (arg1 == 1) {
				method212(arg0, arg3, 2);
				method212(arg0, arg3 + 1, 32);
			}

			if (arg1 == 2) {
				method212(arg0, arg3, 8);
				method212(arg0 + 1, arg3, 128);
			}

			if (arg1 == 3) {
				method212(arg0, arg3, 32);
				method212(arg0, arg3 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				method212(arg0, arg3, 1);
				method212(arg0 - 1, arg3 + 1, 16);
			}

			if (arg1 == 1) {
				method212(arg0, arg3, 4);
				method212(arg0 + 1, arg3 + 1, 64);
			}

			if (arg1 == 2) {
				method212(arg0, arg3, 16);
				method212(arg0 + 1, arg3 - 1, 1);
			}

			if (arg1 == 3) {
				method212(arg0, arg3, 64);
				method212(arg0 - 1, arg3 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg1 == 0) {
				method212(arg0, arg3, 130);
				method212(arg0 - 1, arg3, 8);
				method212(arg0, arg3 + 1, 32);
			}

			if (arg1 == 1) {
				method212(arg0, arg3, 10);
				method212(arg0, arg3 + 1, 32);
				method212(arg0 + 1, arg3, 128);
			}

			if (arg1 == 2) {
				method212(arg0, arg3, 40);
				method212(arg0 + 1, arg3, 128);
				method212(arg0, arg3 - 1, 2);
			}

			if (arg1 == 3) {
				method212(arg0, arg3, 160);
				method212(arg0, arg3 - 1, 2);
				method212(arg0 - 1, arg3, 8);
			}
		}

		if (arg2) {
			if (arg4 == 0) {
				if (arg1 == 0) {
					method212(arg0, arg3, 0x10000);
					method212(arg0 - 1, arg3, 4096);
				}

				if (arg1 == 1) {
					method212(arg0, arg3, 1024);
					method212(arg0, arg3 + 1, 16384);
				}

				if (arg1 == 2) {
					method212(arg0, arg3, 4096);
					method212(arg0 + 1, arg3, 0x10000);
				}

				if (arg1 == 3) {
					method212(arg0, arg3, 16384);
					method212(arg0, arg3 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					method212(arg0, arg3, 512);
					method212(arg0 - 1, arg3 + 1, 8192);
				}

				if (arg1 == 1) {
					method212(arg0, arg3, 2048);
					method212(arg0 + 1, arg3 + 1, 32768);
				}

				if (arg1 == 2) {
					method212(arg0, arg3, 8192);
					method212(arg0 + 1, arg3 - 1, 512);
				}

				if (arg1 == 3) {
					method212(arg0, arg3, 32768);
					method212(arg0 - 1, arg3 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg1 == 0) {
					method212(arg0, arg3, 66560);
					method212(arg0 - 1, arg3, 4096);
					method212(arg0, arg3 + 1, 16384);
				}

				if (arg1 == 1) {
					method212(arg0, arg3, 5120);
					method212(arg0, arg3 + 1, 16384);
					method212(arg0 + 1, arg3, 0x10000);
				}

				if (arg1 == 2) {
					method212(arg0, arg3, 20480);
					method212(arg0 + 1, arg3, 0x10000);
					method212(arg0, arg3 - 1, 1024);
				}

				if (arg1 == 3) {
					method212(arg0, arg3, 81920);
					method212(arg0, arg3 - 1, 1024);
					method212(arg0 - 1, arg3, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("EMCOJCFH.a(IIIZIII)V")
	public void method211(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg2) {
			var7 += 0x20000;
		}

		arg0 -= field664;
		arg5 -= field665;

		if (arg1 == 1 || arg1 == 3) {
			int var8 = arg4;
			arg4 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg4; var9++) {
			if (var9 >= 0 && var9 < field666) {
				for (int var10 = arg5; var10 < arg3 + arg5; var10++) {
					if (var10 >= 0 && var10 < field667) {
						method212(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("EMCOJCFH.a(IZII)V")
	public void method212(int arg0, int arg1, int arg2) {
		field668[arg0][arg1] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("EMCOJCFH.a(IZI)V")
	public void method213(int arg0, int arg1) {
		arg0 -= field664;
		arg1 -= field665;
		field668[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("EMCOJCFH.a(IIIIIII)Z")
	public boolean method214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 == arg3 && arg0 == arg1) {
			return true;
		}

		arg2 -= field664;
		arg1 -= field665;
		arg3 -= field664;
		arg0 -= field665;
		if (arg5 == 0) {
			if (arg4 == 0) {
				if (arg3 - 1 == arg2 && arg0 == arg1) {
					return true;
				}

				if (arg2 == arg3 && arg0 + 1 == arg1 && (field668[arg2][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg0 - 1 == arg1 && (field668[arg2][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg2 == arg3 && arg0 + 1 == arg1) {
					return true;
				}

				if (arg3 - 1 == arg2 && arg0 == arg1 && (field668[arg2][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg2 && arg0 == arg1 && (field668[arg2][arg1] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg3 + 1 == arg2 && arg0 == arg1) {
					return true;
				}

				if (arg2 == arg3 && arg0 + 1 == arg1 && (field668[arg2][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg0 - 1 == arg1 && (field668[arg2][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg2 == arg3 && arg0 - 1 == arg1) {
					return true;
				}

				if (arg3 - 1 == arg2 && arg0 == arg1 && (field668[arg2][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg2 && arg0 == arg1 && (field668[arg2][arg1] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 2) {
			if (arg4 == 0) {
				if (arg3 - 1 == arg2 && arg0 == arg1) {
					return true;
				}

				if (arg2 == arg3 && arg0 + 1 == arg1) {
					return true;
				}

				if (arg3 + 1 == arg2 && arg0 == arg1 && (field668[arg2][arg1] & 0x1280180) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg0 - 1 == arg1 && (field668[arg2][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg3 - 1 == arg2 && arg0 == arg1 && (field668[arg2][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg0 + 1 == arg1) {
					return true;
				}

				if (arg3 + 1 == arg2 && arg0 == arg1) {
					return true;
				}

				if (arg2 == arg3 && arg0 - 1 == arg1 && (field668[arg2][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg3 - 1 == arg2 && arg0 == arg1 && (field668[arg2][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg0 + 1 == arg1 && (field668[arg2][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg2 && arg0 == arg1) {
					return true;
				}

				if (arg2 == arg3 && arg0 - 1 == arg1) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg3 - 1 == arg2 && arg0 == arg1) {
					return true;
				}

				if (arg2 == arg3 && arg0 + 1 == arg1 && (field668[arg2][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg2 && arg0 == arg1 && (field668[arg2][arg1] & 0x1280180) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg0 - 1 == arg1) {
					return true;
				}
			}
		}

		if (arg5 == 9) {
			if (arg2 == arg3 && arg0 + 1 == arg1 && (field668[arg2][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg2 == arg3 && arg0 - 1 == arg1 && (field668[arg2][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg2 && arg0 == arg1 && (field668[arg2][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg2 && arg0 == arg1 && (field668[arg2][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("EMCOJCFH.b(IIIIIII)Z")
	public boolean method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg2 && arg1 == arg5) {
			return true;
		}

		arg2 -= field664;
		arg1 -= field665;
		arg0 -= field664;
		arg5 -= field665;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}

			if (arg4 == 0) {
				if (arg0 + 1 == arg2 && arg1 == arg5 && (field668[arg2][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg5 - 1 == arg1 && (field668[arg2][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg0 - 1 == arg2 && arg1 == arg5 && (field668[arg2][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg5 - 1 == arg1 && (field668[arg2][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg0 - 1 == arg2 && arg1 == arg5 && (field668[arg2][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg5 + 1 == arg1 && (field668[arg2][arg1] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg0 + 1 == arg2 && arg1 == arg5 && (field668[arg2][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg5 + 1 == arg1 && (field668[arg2][arg1] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg3 == 8) {
			if (arg0 == arg2 && arg5 + 1 == arg1 && (field668[arg2][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg2 && arg5 - 1 == arg1 && (field668[arg2][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg2 && arg1 == arg5 && (field668[arg2][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg2 && arg1 == arg5 && (field668[arg2][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("EMCOJCFH.a(ZIIIIIII)Z")
	public boolean method216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg4 + arg6 - 1;
		int var9 = arg0 + arg2 - 1;
		if (arg3 >= arg6 && arg3 <= var8 && arg5 >= arg0 && arg5 <= var9) {
			return true;
		}

		if (arg6 - 1 == arg3 && arg5 >= arg0 && arg5 <= var9 && (field668[arg3 - field664][arg5 - field665] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg3 && arg5 >= arg0 && arg5 <= var9 && (field668[arg3 - field664][arg5 - field665] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		}

		if (arg0 - 1 == arg5 && arg3 >= arg6 && arg3 <= var8 && (field668[arg3 - field664][arg5 - field665] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg5 && arg3 >= arg6 && arg3 <= var8 && (field668[arg3 - field664][arg5 - field665] & 0x20) == 0 && (arg1 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
